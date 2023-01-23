package com.main;

import com.cls.User;
import com.module.UserModule;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class BindingAnnotations {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new UserModule());
	    User user = injector.getInstance(User.class);
	    user.makename();   
	}

}
