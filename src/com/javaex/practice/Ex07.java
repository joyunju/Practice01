//Ex07 아래의 출력결과를 예상하여 작성하세요.
//Ex06 문제와 어느 부분이 다른지 비교해 보세요.
//차이점 : 증감식이 앞에 위치하고 뒤에 위치하는지에 따라 생기는 차이 !

package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {

		int i = 10;
		int n = ++i % 2;

		// 출력
		System.out.println(i); // 예상 값 : 11
		// ++i --> 10 + 1 = 11
		System.out.println(n); // 예상 값 : 0
		// i가 증감 후에 계산 --> 11 % 2의 나머지는 1
	}
}
