/*
 * 사용자 입력과 컴퓨터 숫자 비교
 */

package main.java;

public class Check {

	private int strikeCount;
	private int ballCount;

	public boolean checkAnswer(int[] com, int[] user) {
		strikeCount = ballCount = 0;
		checkStrike(com, user);
		checkBall(com, user);

		if (strikeCount > 0)
			System.out.print(strikeCount + " 스트라이크 ");
		if (ballCount > 0)
			System.out.print(ballCount + " 볼 ");
		System.out.println();

		if (strikeCount == 3)
			return true;
		return false;
	}

	public void checkStrike(int[] com, int[] user) {
		for (int i = 0; i < 3; i++) {
			compare(1, com[i], user[i]);
		}
	}

	public void checkBall(int[] com, int[] user) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i != j) {
					compare(2, com[i], user[j]);
				}
			}
		}
	}

	public void compare(int mod, int num1, int num2) {
		int count = 0;
		if (num1 == num2)
			count++;

		if (mod == 1)
			strikeCount += count;
		if (mod == 2)
			ballCount += count;
	}

}
