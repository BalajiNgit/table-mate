package com.example.greeting.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.User;
import com.example.greeting.services.UserAuthorizationService;

@RestController
@RequestMapping(value="/authorization")
public class AuthorizationManager {
	
    @Autowired
	private UserAuthorizationService userAuthorization;
    
    @RequestMapping(value="/validateUser",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> validateUser(@RequestBody User user,HttpServletRequest request) throws Exception{
    	try{
    		boolean validUser=userAuthorization.getAuthorization(user);
    		return new ResponseEntity<>(validUser,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}
}
