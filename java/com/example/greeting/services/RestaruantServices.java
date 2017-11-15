package com.example.greeting.services;

import java.util.List;

import com.example.greeting.model.Restaruant;
import com.example.greeting.model.RestaruantTables;

public interface RestaruantServices {
	public List<Restaruant> loadRestaruant();
	public List<RestaruantTables> loadRestaruantTables(Restaruant restaruant);
}
