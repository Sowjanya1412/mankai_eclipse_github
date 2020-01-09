package com.SpringbootExample1.service;

import java.util.Optional;

import com.SpringbootExample1.model.LoginUser;

public interface LoginUserService{

	public LoginUser createUser(LoginUser loginUser);

	public Optional<LoginUser> readUserById(int userId);

	//public LoginUser updateUserById(LoginUser loginUser);

	public void deleteUserById(int userId);
}
