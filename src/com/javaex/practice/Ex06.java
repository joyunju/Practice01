//Ex06 아래의 출력결과를 예상하여 작성하세요.

package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {

		int i = 10;
		int n = i++ % 2;

		// 출력
		System.out.println(i); // 예상 값 : 11
		// i++ --> 10 + 1 = 11
		System.out.println(n); // 예상 값 : 0
		// i가 증감되기 전에 계산 --> 10 % 2의 나머지는 0
	}
}
