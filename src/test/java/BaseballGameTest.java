package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.BaseballGame;

class BaseballGameTest {
	
	BaseballGame bsGame = new BaseballGame();

	@Test
	void testRunGame() {
		
		// 한 게임 종료 후 1 입력 시 True 반환 테스트
		assertTrue(bsGame.runGame());
	}

}
