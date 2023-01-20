package com.main;
import com.cls.TextEditor;
import com.module.TextEditorModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProviderBinding {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TextEditorModule());
		TextEditor editor = injector.getInstance(TextEditor.class);
		editor.makeSpellCheck();
	}

}
