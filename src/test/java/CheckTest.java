package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Check;

class CheckTest {

	Check check = new Check();

	@Test
	void testCheckAnswer() {
		int[] com = { 1, 2, 3 };
		int[] user = { 1, 2, 3 };

		assertTrue(check.checkAnswer(com, user));

		assertFalse(check.checkAnswer(com, new int[] { 1, 3, 4 }));
	}

}
