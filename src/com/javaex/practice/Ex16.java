//Ex16 상품을 구매하면 정가의 10%를 부가세로 부여한다.
//아래와 같이 출력되도록 프로그램을 작성하세요 

package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격 : ");
		double product = sc.nextDouble();
		System.out.print("받은 돈 : ");
		double price = sc.nextDouble();

		// 부가세
		double tax = (double) product / 10;
		double give = (double) price - product;

		System.out.println("================");

		System.out.println("받은 돈 : " + price);
		System.out.println("상품가격 : " + product);
		System.out.println("부가세 : " + tax);
		System.out.println("잔액 : " + give);

		sc.close();
	}

}
