package com.example.greeting.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.model.Category;
import com.example.greeting.model.Restaruant;
import com.example.greeting.model.RestaruantTables;
import com.example.greeting.services.CategoryServices;
import com.example.greeting.services.RestaruantServices;

@RestController
@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE,value="/restaruant")
public class TableController {
	
	@Autowired
	private RestaruantServices restaruantServices;
    
    @RequestMapping(value="/loadinfo",method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> loadRestaruant() throws Exception{
    	try{
    		ArrayList<Restaruant> Restaruant=(ArrayList<Restaruant>) restaruantServices.loadRestaruant();
    		return new ResponseEntity<>(Restaruant,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}
    
    @RequestMapping(value="/loadTables",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> loadRestaruantTable(@RequestBody Restaruant restaruant,HttpServletRequest request) throws Exception{
    	try{
    		ArrayList<RestaruantTables> RestaruantTable=(ArrayList<RestaruantTables>) restaruantServices.loadRestaruantTables(restaruant);
    		return new ResponseEntity<>(RestaruantTable,HttpStatus.OK);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
	}

}
