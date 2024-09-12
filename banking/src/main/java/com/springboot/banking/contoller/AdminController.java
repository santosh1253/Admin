package com.springboot.banking.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.banking.entity.Admin;
import com.springboot.banking.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/admin")
	public Admin saveUser(@RequestBody Admin admin)
	{
		return service.createAdmin(admin);
	}
	
	@PutMapping("/updateadmin")
	public Admin updateUser(@RequestBody Admin updatedAdmin)
	{
		return service.updateAdmin(updatedAdmin);
	}
	
	@GetMapping("/admin/{id}")
	public Admin getUser(@RequestParam int id)
	{
		return service.fetchAdmin(id);
	}
	
	@DeleteMapping("/admin/{id}")
	public String deleteUser(@RequestParam int id)
	{
		return service.deleteAdmin(id);
	}
	
	
	

}
