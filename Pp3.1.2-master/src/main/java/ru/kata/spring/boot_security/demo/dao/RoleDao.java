package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {
    Role getRoleByName(String name);
    Role getRoleById(long id);
    List<Role> getAllRoles();
    Role getDefaultRole();
    Set<Role> findRoles(List<Long> roles);


}
