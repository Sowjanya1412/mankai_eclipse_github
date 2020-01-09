package com.SpringbootExample1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootExample1.DAO.LoginUserDAO;
import com.SpringbootExample1.model.LoginUser;

@Service
public class LoginUserServiceImpl implements LoginUserService{

	@Autowired
	private LoginUserDAO loginUserDAO;
	LoginUser loginUser;
	
	@Override
	public LoginUser createUser(LoginUser loginUser) {
		return this.loginUserDAO.save(loginUser);
	}
	

	@Override
	public Optional<LoginUser> readUserById(int userId) {
		return this.loginUserDAO.findById(userId);
	}

	

	

	@Override
	public void deleteUserById(int userId) {
		
		this.loginUserDAO.deleteById(userId);
	}

	

}
