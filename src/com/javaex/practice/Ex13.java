//Ex13 원화를 달러화로 계산하는 프로그램을 작성하세요.
//(환율 1달러 = 1230.95원 상수로 지정)

package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("환전할 원화를 입력하세요 :");
		int won = sc.nextInt();

		double dollar = won / 1230.95;

		System.out.println("받으실 달러는 " + dollar);

		sc.close();
		
		//예상 출력값 : 
		//환전할 원화를 입력하세요 :1000000
		//받으실 달러는 812.3806815873918

	}

}
