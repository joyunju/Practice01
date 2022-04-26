//Ex20 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("500원의 개수: ");
		int num1 = sc.nextInt();
		System.out.print("100원의 개수: ");
		int num2 = sc.nextInt();
		System.out.print("50원의 개수: ");
		int num3 = sc.nextInt();
		System.out.print("10원의 개수: ");
		int num4 = sc.nextInt();

		int result1 = num1 * 500;
		int result2 = num2 * 100;
		int result3 = num3 * 50;
		int result4 = num4 * 10;

		int sum = result1 + result2 + result3 + result4;

		System.out.println("동전의 총합은 " + sum + " 원 입니다.");

		sc.close();

	}

}
