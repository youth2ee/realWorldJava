package com.iteratrlearning.shu_book.chapter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class InspectorTest {

	@Test
	void shouldExecuteOneAction() {
		final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
		final Action mockAction = mock(Action.class);
		
		businessRuleEngine.addAction(mockAction);
		businessRuleEngine.run();
		
		verify(mockAction).perform();
		
	}
	

}
