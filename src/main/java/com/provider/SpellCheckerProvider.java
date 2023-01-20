package com.provider;
import com.cls.SpellChecker;
import com.impl.SpellCheckerImpl;

import com.google.inject.Provider;

public class SpellCheckerProvider implements Provider<SpellChecker>{
	@Override
	   public SpellChecker get() {
	      String dbUrl = "ABC";
	      String user = "Pune";

	      SpellChecker SpellChecker = (com.cls.SpellChecker) new SpellCheckerImpl(dbUrl, user);
	      return SpellChecker;
	   }
}
