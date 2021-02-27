package com.example.propmgmt;


//controller

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/tenants-management/v1")


public class TenantsController {

	  @Autowired
	    private TenantsRepository tenantsrepository;
	 
	  @GetMapping("/tenants")
	  public List<Tenants> getAllUsers(Model model) {
	   	
	  return this.tenantsrepository.findAll();
	 }
	 // get tenant by id
	  @GetMapping("/tenants/{id}")
	  public ResponseEntity<Tenants> getUserById(@PathVariable(value = "id") Long userId)
	    throws ResourceNotFoundException {
	    Tenants tenant = usersrepository.findById(userId)
	     .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
	    return ResponseEntity.ok().body(tenant);
	    }

	  @PostMapping("/tenants")
	  public Users createUsers(@Valid @RequestBody Users user) {
	 	 return tenantsrepository.save(user);
	  }
}


