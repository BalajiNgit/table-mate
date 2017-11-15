package com.example.greeting.dao;

import java.util.List;

import com.example.greeting.model.Restaruant;
import com.example.greeting.model.RestaruantTables;

public interface RestaruantDAO {
	public List<Restaruant> loadAllRestaruant();
	public List<RestaruantTables> loadRestaruantTables(Restaruant restaruant);
}
