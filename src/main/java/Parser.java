/*
 * 사용자 입렵 문자열을 정수형 배열로 분할
 */

package main.java;

public class Parser {

	public int[] parsing(String str) {
		int[] result = new int[3];

		int num = Integer.parseInt(str);
		for (int i = result.length - 1; i >= 0; i--) {
			result[i] = num % 10;
			num /= 10;
		}
		
		return result;
	}
}
