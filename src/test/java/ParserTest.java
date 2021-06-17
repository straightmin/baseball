package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Parser;

class ParserTest {

	Parser parser = new Parser();

	@Test
	void testParsing() {
		assertArrayEquals(new int[] { 1, 2, 3 }, parser.parsing("123"));
	}

}
