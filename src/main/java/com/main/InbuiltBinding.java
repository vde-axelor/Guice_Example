package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.cls.TextEditor;
import com.module.TextEditorModule;


public class InbuiltBinding {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TextEditorModule());
	    TextEditor editor = injector.getInstance(TextEditor.class);
	    editor.makeSpellCheck();
	    System.out.println("Hello");
	}

}
