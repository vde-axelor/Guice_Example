package com.module;

import com.cls.Name;
import com.impl.LastName;
import com.cls.defaultName;

import com.google.inject.AbstractModule;

public class UserModule extends AbstractModule{
	 @Override
	   protected void configure() {
//	      bind(Name.class).annotatedWith(WinWord.class)
//	         .to(FirstName.class);    
		   bind(Name.class).annotatedWith(WinWord.class).to(LastName.class);    
	   } 
}
