package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Parser;

class ParserTest {

	@Test
	void testParsing() {
		assertArrayEquals(new int[] { 1, 2, 3 }, Parser.parsing("123"));
	}

}
