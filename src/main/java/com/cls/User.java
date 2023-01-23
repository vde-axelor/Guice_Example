package com.cls;
import com.cls.defaultName;

import com.google.inject.Inject;

public class User {
	 private Name name;   

	   @Inject
	   public User(@WinWord Name name) {
	      this.name = name;
	   }

	   public void makename(){
	      name.checkname(); 
	   } 
}
