package com.myoffice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myoffice.model.employee.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	List<Role> findByRoleNameIgnoreCase(String roleName);
	List<Role> findByRoleNameLike(String roleName);
	List<Role> findByRoleNameContaining(String roleName);
	Role findByRoleId(Long roleId);
}
