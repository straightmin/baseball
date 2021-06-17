package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.NumberGenerator;

class NumberGeneratorTest {

	NumberGenerator gen = new NumberGenerator();

	// 중복을 캐치하는지 확인
	@Test
	void testOverlap() {
		assertTrue(gen.hasOverlap(new int[] { 1, 1, 2 }));

		assertFalse(gen.hasOverlap(new int[] { 1, 2, 3 }));
	}

	// 생성된 3개 숫자가 중복이 없는지 확인
	@Test
	void testGenerateNumbers() {
		int[] result = gen.getNumbers();
		
		assertFalse(gen.hasOverlap(result));
	}

}
