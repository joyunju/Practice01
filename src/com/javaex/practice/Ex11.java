// Ex11 월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월급을 입력하세요:");
		int money = sc.nextInt();
		
		int result = money*12*10;
		
		System.out.print("10년동안 최대 저축액은 " + result + "원 입니다.");
		
		sc.close();
		
		//출력값 : 
		//월급을 입력하세요:200
		//10년동안 최대 저축액은 24000원 입니다.
	}
}
