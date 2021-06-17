/*
 * 숫자야구게임
 */

package main.java;

import java.util.Scanner;

public class BaseballGame {
	
	int[] com;
	int[] user;
	boolean run = true;
	Scanner scanner;
	NumberGenerator generator;
	Check check;
	
	public BaseballGame(){
		generator = new NumberGenerator();
		check= new Check();
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BaseballGame baseballGame = new BaseballGame();
		
		while(baseballGame.runGame());
	}

	
	public boolean runGame() {
		com = generator.getNumbers();
		
		do {
			System.out.print("숫자를 입력해주세요 : ");
			user = Parser.parsing(scanner.nextLine());
		} while(!check.checkAnswer(com, user));
		
		System.out.println("3개의숫자를모두맞히셨습니다!게임종료\r\n" + 
				"게임을새로시작하려면1,종료하려면2를입력하세요.");
		return setCondition(scanner.nextLine());
	}
	
	public boolean setCondition(String str) {
		int num = Integer.parseInt(str);
		
		if(num == 1)	// 게임 재시작
			return true;
		if(num == 2)	// 게임 종료
			return false;
		
		return false;
	}
}
