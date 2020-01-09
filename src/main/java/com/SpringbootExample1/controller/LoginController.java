package com.SpringbootExample1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootExample1.model.LoginUser;
import com.SpringbootExample1.service.LoginUserService;

@RestController
public class LoginController {

	@Autowired
	private LoginUserService loginUserService;
	
	
	@GetMapping(value = "/first")
	public String sayHello(){
		return "Welcome to Spring boot";
	}
	
	@PostMapping(value = "/create")
	public LoginUser createUser(@RequestBody LoginUser loginUser){
		
		return this.loginUserService.createUser(loginUser);
	}
	
	@GetMapping(value = "/read/{userId}")
	public Optional<LoginUser> readUser(@PathVariable int userId){
	
		return this.loginUserService.readUserById(userId);
	}
	
	@PutMapping(value = "/update")
	public LoginUser updateUser(@RequestBody LoginUser loginUser){
		
		return this.loginUserService.createUser(loginUser);
	}
	
	@DeleteMapping(value = "/delete/{userId}")
	public void deleteUser(@PathVariable int userId){
		
		this.loginUserService.deleteUserById(userId);
	}
}
