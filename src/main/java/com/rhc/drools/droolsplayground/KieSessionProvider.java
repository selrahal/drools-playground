package com.rhc.drools.droolsplayground;


import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieSessionProvider {
	private static KieBase kieBase;
	
	static {
		KieContainer kieContainer = KieServices.Factory.get().newKieClasspathContainer();
		kieBase = kieContainer.getKieBase();
	}
	
	public static KieSession createKieSession() {
		return kieBase.newKieSession();
	}
}
