package com.module;

import com.google.inject.AbstractModule;
import com.cls.Name;
import com.impl.UserData;
import com.impl.UserCity;

public class UserModule extends AbstractModule{
	 @Override
	   protected void configure() {
	      bind(Name.class).to(UserData.class);
	      bind(UserData.class).to(UserCity.class);
	   } 
}
