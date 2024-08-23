package org.example.sem4_project_api.Service;

import org.example.sem4_project_api.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService customerService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Optional<Employee> publisher = customerService.findById(id);
        return publisher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee publisher) {
        return customerService.save(publisher);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee publisherDetails) {
        Optional<Employee> publisher = customerService.findById(id);
        if (publisher.isPresent()) {
            Employee updatedPublisher = publisher.get();
           updatedPublisher.setFullName(publisherDetails.getFullName());
           updatedPublisher.setEmail(publisherDetails.getEmail());
           updatedPublisher.setPhone(publisherDetails.getPhone());
           updatedPublisher.setAge(publisherDetails.getAge());
           updatedPublisher.setAtWork(publisherDetails.isAtWork());
           updatedPublisher.setPassword(publisherDetails.getPassword());
           updatedPublisher.setRole(publisherDetails.getRole());
            return ResponseEntity.ok(customerService.save(updatedPublisher));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        Optional<Employee> publisher = customerService.findById(id);
        if (publisher.isPresent()) {
            customerService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
