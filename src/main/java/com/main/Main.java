package com.main;
import com.cls.*;

import com.module.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Main {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TextEditorModule());
		TextEditor editor = injector.getInstance(TextEditor.class);
	    editor.makeSpellCheck();
	}

}
