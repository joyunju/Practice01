//Ex12 반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14로 상수로 지정)

package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");

		int radius = sc.nextInt();

		double area = radius * radius * 3.14;

		System.out.print("원의 넓이는 " + area);

		sc.close();
		
		// 출력값 :
		//반지름을 입력하세요 : 3
		//원의 넓이는 28.26

	}

}
