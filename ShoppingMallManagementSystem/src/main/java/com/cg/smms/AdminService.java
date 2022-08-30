package com.cg.smms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	public List<Admin> listAll(){
		return repo.findAll();
		
	}
	
	public Admin get(Integer id) {
		return repo.findById(id).get();
		
	}
	
	public void save(Admin admin) {
		repo.save(admin);
	}
	
	public void delect(Integer id) {
		repo.deleteById(id);
	}

}
