package org.example.sem4_project_api.Service;


import org.example.sem4_project_api.Model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;


    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.findAll();
    }
}
