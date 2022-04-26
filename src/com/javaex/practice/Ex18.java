//Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
//*[참고] °C : 섭씨 기호 °F : 화씨 기호
//화씨->섭씨 °C = 5/9 * (°F - 32) 섭씨->화씨 °F = (°C * 9/5) + 32

package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 : ");
		double ondo = sc.nextDouble();
		
		//5/9 --> 형변환 (double)
		double change = (double)5/9 * (ondo - 32);
		
		System.out.println("화씨 " + ondo + " 의 섭씨온도는 " + change + " 입니다.");
		
		sc.close();

	}

}
