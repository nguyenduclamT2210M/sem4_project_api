package org.example.sem4_project_api.Service;

import jakarta.transaction.Transactional;
import org.example.sem4_project_api.Model.Role;
import org.example.sem4_project_api.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}