package com.example.greeting.dao.impl;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.greeting.dao.UserAuthorizationDAO;
import com.example.greeting.model.User;


@Transactional
@Repository
public class UserAuthorizationDAOImpl implements UserAuthorizationDAO {
	
   
    @PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean getUserAutorization(User user) {
		// TODO Auto-generated method stub
		StringBuilder authenticateUser=new StringBuilder("Select count(*) from user_master_details where username=:userName AND password=:password");
		Query query=entityManager.createNativeQuery(authenticateUser.toString());
		query.setParameter("userName",user.getUserName());
		query.setParameter("password",user.getPassword());
		int count=((BigInteger) query.getSingleResult()).intValue();
		if(count==1)
			return true;
		return false;
	}

}
