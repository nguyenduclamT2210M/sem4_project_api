package org.example.sem4_project_api.Service;

import org.example.sem4_project_api.Model.Customer;
import org.example.sem4_project_api.Model.Employee;
import org.example.sem4_project_api.Repository.CustomerRepository;
import org.example.sem4_project_api.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee customer) {
        return employeeRepository.save(customer);
    }

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
