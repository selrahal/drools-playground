package com.rhc.drools.droolsplayground;

import org.kie.api.runtime.KieSession;

import com.rhc.drools.droolsplayground.model.Beer;

public class Playground {

	public static void main(String[] args) {
		//Get KieSession
		KieSession kieSession = KieSessionProvider.createKieSession();
		
		//Hop Drop and Roll beer
		Beer hdar = new Beer();
		hdar.setName("Hop Drop and Roll");
		kieSession.insert(hdar);
		
		//American Black Ale
		Beer aba = new Beer();
		aba.setName("American Black Ale");
		kieSession.insert(aba);
		
		//Fire any rules that have matched
		kieSession.fireAllRules();
		
		System.out.println(aba);
		System.out.println(hdar);
	}
}
