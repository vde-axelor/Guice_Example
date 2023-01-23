package com.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.cls.Data;

public class ShowName implements Data{
	@Inject @Named("NAME")
	   private String name;

	   public ShowName(){}

	   @Override
	   public void show() { 
	      System.out.println("Inside Name" );
	      System.out.println("------------");
	      System.out.println(name); 
	   }
}
