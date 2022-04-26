//Ex14 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.
//(가로 세로 변수 double형으로 작성)

package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로를 입력하세요 : ");
		double width = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		double height = sc.nextDouble();

		double area = width * height;
		double round = (width * 2) + (height * 2);

		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + round);
		
		sc.close();

	}

}
