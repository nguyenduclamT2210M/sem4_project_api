package org.example.sem4_project_api.Service;

import org.example.sem4_project_api.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Optional<Customer> publisher = customerService.findById(id);
        return publisher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer publisher) {
        return customerService.save(publisher);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer publisherDetails) {
        Optional<Customer> publisher = customerService.findById(id);
        if (publisher.isPresent()) {
            Customer updatedPublisher = publisher.get();
            updatedPublisher.setName(publisherDetails.getName());
            updatedPublisher.setPhone(publisherDetails.getPhone());
            updatedPublisher.setBirthday(publisherDetails.getBirthday());
            updatedPublisher.setCreated_at(publisherDetails.getCreated_at());
            return ResponseEntity.ok(customerService.save(updatedPublisher));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int id) {
        Optional<Customer> publisher = customerService.findById(id);
        if (publisher.isPresent()) {
            customerService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
