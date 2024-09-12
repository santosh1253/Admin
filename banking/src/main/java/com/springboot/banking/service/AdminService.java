package com.springboot.banking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.entity.Admin;
import com.springboot.banking.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository arepo;

	
	public AdminService(AdminRepository arepo) {
		System.out.println("DI via Constructor");
		this.arepo = arepo;
	}

	// Creating admin
	public Admin createAdmin(Admin admin) {
		Admin saved = arepo.save(admin);
		return saved;
	}

	// updating admin
	public Admin updateAdmin(Admin updateAdmin) {
		Admin admin = fetchAdmin(updateAdmin.getId());
		Admin updated = null;
		if (admin != null) {
			admin.setUname(updateAdmin.getUname());
			admin.setPassword(updateAdmin.getPassword());
			updated = arepo.save(admin);
			;
		}

		return updated;
	}

	// Reading admin
	public Admin fetchAdmin(int id) {
		Optional<Admin> res = arepo.findById(id);
		if (res.isPresent()) {
			return res.get();
		}
		return null;
	}

	// Delete a admin record
	public String deleteAdmin(int id) {
		arepo.deleteById(id);
		return "Admin with id " + id + " delted";
	}

}
