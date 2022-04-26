//Ex19 long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
//(단 빛의 속도는 300000 km/s 로 계산한다)

package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		// 공식 : 초 * 분 * 시간 * 일수 * 빛의 속도 = 1년동안 가는 거리
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		long speed = 300000L;

		long light = year * speed * 60 * 60 * 24 * 365L;

		System.out.println("빛이 " + year + "년 동안 가는 거리는 " + light + "km 입니다.");

		sc.close();

	}

}
