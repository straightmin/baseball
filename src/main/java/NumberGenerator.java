/*
 * 컴퓨터 숫자 생성
 * 3개의 숫자를 배열로 중복 없이 생성
 */

package main.java;

import java.util.Random;

public class NumberGenerator {

	private int[] numbers = { 0, 0, 0 };
	private Random rand = new Random();

	public int[] getNumbers() {
		while(hasOverlap(numbers)) {	// 중복이 있을경우 계속 반복
			numbers = generateNumbers(numbers);
		}
		
		return numbers;
	}

	// 무작위 숫자 3개 생성
	public int[] generateNumbers(int[] nums) {
		for (int i = 0; i < 3; i++) {
			nums[i] = rand.nextInt(8) + 1;	// 범위: 1 ~ 9
		}
		
		return nums;
	}

	// 생성된 3개 숫자 중복 확인
	public boolean hasOverlap(int[] nums) {
		if (nums[0] == nums[1])
			return true;
		if (nums[0] == nums[2])
			return true;
		if (nums[1] == nums[2])
			return true;

		return false;
	}

}
