package com.module;
import com.impl.*;
import com.cls.*;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule{
	@Override
	   protected void configure() {
	      try {
	         bind(SpellChecker.class).toConstructor(SpellCheckerImpl.class.getConstructor(String.class));
	      } catch (NoSuchMethodException | SecurityException e) {
	         System.out.println("Required constructor missing");
	      } 
	      bind(String.class)
	         .annotatedWith(Names.named("Name"))
	         .toInstance("Hello...");
	   } 
}
