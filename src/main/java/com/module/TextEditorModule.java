package com.module;
import com.impl.EnterName;
import com.cls.Name;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class TextEditorModule extends AbstractModule{
	@Override
	   protected void configure() {} 

	   @Provides
	   public Name provideName(){

	      String fname = "Vishwa";
	      String lname = "Desai";

	      Name n1 = new EnterName(fname, lname);
	      return n1;
	   }
}
