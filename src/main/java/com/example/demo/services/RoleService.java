package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialIssue.entities.Role;
import com.example.demo.repositories.Rolerepository;
@Service
public class RoleService {
	@Autowired
	 private Rolerepository repo;
	
	public List<Role> getAllRoles() {
        return Rolerepository.findAll();
    }
	

    public Optional<Role> getRoleById(int id) {
        return roleRepository.findById(id);
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }

}
