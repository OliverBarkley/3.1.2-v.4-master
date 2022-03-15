package ru.kata.spring.boot_security.demo.service.roleService;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Set<Role> findRoles(List<Long> roles);
    Role getRoleByName(String name);
    Role getRoleById(long id);
    List<Role>getAllRoles();
    Role getDefaultRole();
}
