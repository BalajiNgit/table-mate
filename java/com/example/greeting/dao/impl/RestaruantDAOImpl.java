package com.example.greeting.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.greeting.dao.RestaruantDAO;
import com.example.greeting.model.Category;
import com.example.greeting.model.Restaruant;
import com.example.greeting.model.RestaruantTables;

@Transactional
@Repository
public class RestaruantDAOImpl implements RestaruantDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Restaruant> loadAllRestaruant() {
		// TODO Auto-generated method stub
				StringBuilder restaruant=new StringBuilder("Select * from restaruant_info");
				Query query=entityManager.createNativeQuery(restaruant.toString());
				List<Object[]> result=query.getResultList();
				List<Restaruant> allRestaruant=new ArrayList<>(result.size());
				for (Object[] r : result) {
					Restaruant res=new Restaruant((int)r[0],(String)r[1],(String)r[2]);
					allRestaruant.add(res);
				}
				return allRestaruant;
	}

	@Override
	public List<RestaruantTables> loadRestaruantTables(Restaruant restaruant) {
		// TODO Auto-generated method stub
				StringBuilder restaruantTable=new StringBuilder("Select * from restaruant_table where restaruant_id=:r_Id");
				Query query=entityManager.createNativeQuery(restaruantTable.toString());
				query.setParameter("r_Id",restaruant.getRestarunat_id());
				List<Object[]> result=query.getResultList();
				List<RestaruantTables> allrestaruantTables=new ArrayList<>(result.size());
				for (Object[] r : result) {
					RestaruantTables c=new RestaruantTables((int)r[0],(String)r[1],(String)r[2],(int)r[3]);
					allrestaruantTables.add(c);
				}
				return allrestaruantTables;
			}

	
	
	
	
		
}
