package com.example.greeting.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greeting.dao.UserAuthorizationDAO;
import com.example.greeting.model.User;
import com.example.greeting.services.UserAuthorizationService;

@Service
public class UserAuthorizationServiceImpl implements UserAuthorizationService{
	
    @Autowired
    private UserAuthorizationDAO userAuthorizationDAO;
	
	@Override
	public boolean getAuthorization(User user) {
		boolean isValidateUser=false;
		// TODO Auto-generated method stub
		try{
			isValidateUser=userAuthorizationDAO.getUserAutorization(user);
		}catch(Exception e){
			e.printStackTrace();
		}
		return isValidateUser;
	}

}
