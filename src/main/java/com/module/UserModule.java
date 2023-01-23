package com.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class UserModule extends AbstractModule{

	   @Override
	   protected void configure() { 
	      bind(String.class)
	         .annotatedWith(Names.named("NAME"))
	         .toInstance("Vishwa Desai");
	   } 
}
