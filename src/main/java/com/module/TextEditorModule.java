package com.module;
import javax.inject.Provider;

import com.cls.SpellChecker;
import com.provider.SpellCheckerProvider;

import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule{
	 @Override
	   protected void configure() {
	      bind(SpellChecker.class).toProvider((Class<? extends Provider<? extends SpellChecker>>) SpellCheckerProvider.class);
	   } 
}
