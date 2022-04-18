//다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.

package com.javaex.practice;

public class Ex04 {
	public static void main(String[] args) {
		
		//문제에 있었던 오류
		// 마무리시 세미클론 있어야함 
		// sum 변수 자료형 입력하기
		// 문자는 쌍따옴표 안에 작성
		int x, y;

		x = 10;
		y = 20;

		int sum = x + y;

		System.out.println("합은 " + sum);
	}
}
