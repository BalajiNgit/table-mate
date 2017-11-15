package com.example.greeting.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greeting.dao.RestaruantDAO;
import com.example.greeting.model.Restaruant;
import com.example.greeting.model.RestaruantTables;
import com.example.greeting.services.RestaruantServices;
@Service
public class RestaruantServicesImpl implements RestaruantServices {
	@Autowired
	RestaruantDAO restaruantDAO;
	@Override
	public List<Restaruant> loadRestaruant() {
		// TODO Auto-generated method stub
		List<Restaruant> allRestaruant=null;
		try{
			allRestaruant=restaruantDAO.loadAllRestaruant();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return allRestaruant;
	}

	@Override
	public List<RestaruantTables> loadRestaruantTables(Restaruant restaruant) {
		// TODO Auto-generated method stub
		List<RestaruantTables> allRestaruantTable=null;
		try{
			allRestaruantTable=restaruantDAO.loadRestaruantTables(restaruant);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return allRestaruantTable;
	}

}
