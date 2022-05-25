package com.iteratrlearning.shu_book.chapter;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {

	private final List<Action> actions;
	
	public BusinessRuleEngine() {
		this.actions = new ArrayList<>();
	}
	
	public void addAction(final Action action) {
		this.actions.add(action);
	}
	
	public int count() {
		return this.actions.size();
	}
	
	public void run() {
		 this.actions.forEach(action -> action.perform());
		
//		throw new UnsupportedOperationException();
	}
	
//    private final List<Rule> rules;
//    private final Facts facts;
//
//    public BusinessRuleEngine(Facts facts) {
//        this.facts = facts;
//        this.rules = new ArrayList<>();
//    }
//
//    public void addRule(Rule rule) {
//        this.rules.add(rule);
//    }
//
//    public void run() {
//        this.rules.forEach(rule -> rule.perform(facts));
//    }

}