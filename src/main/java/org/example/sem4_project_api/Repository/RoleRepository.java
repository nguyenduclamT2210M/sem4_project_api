package org.example.sem4_project_api.Repository;

import org.example.sem4_project_api.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Integer> {
}
