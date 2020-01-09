package com.SpringbootExample1.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootExample1.model.LoginUser;


public interface LoginUserDAO extends CrudRepository<LoginUser, Integer> {

	
}
