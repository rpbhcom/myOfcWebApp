package com.myoffice.controller.employee;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myoffice.model.employee.Role;
import com.myoffice.repository.RoleRepository;

@RestController
@RequestMapping("/role")
@CrossOrigin()
public class RoleController {
	
	@Autowired
	RoleRepository rolerepo;
	
	@GetMapping
	public List<Role> getRoleList(){
		return rolerepo.findAll();
	}
	
	@GetMapping("/find/{roleName}")
	public List<Role> findRoleByName(@PathVariable(value="roleName")String roleName){
		System.out.println("roleName "+roleName);
		return rolerepo.findByRoleNameContaining(roleName);			
	}
	
	@GetMapping("/findById/{roleId}")
	public Role findRoleById(@PathVariable(value="roleId")Long roleId){
		return rolerepo.findByRoleId(roleId);			
	}
	
	@PostMapping("/save")
	public Role save(@Valid @RequestBody Role role){
		Role r = new Role();
		r.setRoleName(role.getRoleName());
		r.setRoleDesc(role.getRoleDesc());
		r.setCreateDate(new Date());
		r.setCreatedBy(null);
		r.setCreatedBy((long) 1);
		rolerepo.save(r);
		return r;
	}
	
	@PutMapping("/update/{roleId}")

	public Role updateRole(@Valid @RequestBody Role role) {
		Role r = rolerepo.findByRoleId(role.getRoleId());
		r.setRoleDesc(role.getRoleDesc());
		r.setRoleName(role.getRoleName());
		r.setModifiedDate(new Date());
		return r;
	}
	
	@DeleteMapping("/delete")
	public void deleteRole(@Valid @RequestBody Role role) {
		Role r = rolerepo.findByRoleId(role.getRoleId());
		rolerepo.delete(r);
	}
}
