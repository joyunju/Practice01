//Ex17 사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
// 구의 부피를 구하는 공식

package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");

		// 반지름 값 입력받기
		double r = sc.nextDouble();
		// 구의 부피 = 4/3*3.14*r의 세제곱

		double v = (double)4/3 * 3.14 * r * r * r;

		System.out.println("구의 부피는 : " + v + " 입니다.");

		sc.close();
	}
}
