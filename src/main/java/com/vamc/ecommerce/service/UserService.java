package com.vamc.ecommerce.service;

import com.vamc.ecommerce.exception.UserException;
import com.vamc.ecommerce.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
