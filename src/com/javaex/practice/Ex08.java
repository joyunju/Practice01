//Ex08 다음코드의 잘못된 부분을 찾아서 수정해 보세요.

package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {

		// int x, y =0;
		int x = 0;
		int y = 0;
		// char grade = "A"; --> char은 '' 작은 따옴표 사용
		char grade = 'A';
		// int salary = 2,000,000; --> , 사용 x
		int salary = 2000000;
		// byte n = 1000; --> byte는 표현 범위가 -128 ~ 127까지 가능
		byte n = 127;

		// print
		System.out.println(x);
		System.out.println(y);
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(n);
	}
}
