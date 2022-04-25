//Ex09 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
//결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
//*[참고] °C : 섭씨 기호 °F : 화씨 기호
//화씨->섭씨 °C = 5/9 * (°F - 32)
//섭씨->화씨 °F = (°C * 9/5) + 32

package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {

		double f = 80.0;

		// 예상 결과값 : 0.0
		System.out.println(5 / 9 * (f - 32.0));
		// 이유 : 5/9의 정수값이 0이니까 곱한 후 결과값이 0으로 나옴.
		// 수정하려면 5/9 앞에 형변환으로 double또는 float를 사용하기.

		// 수정 출력
		System.out.println((double) 5 / 9 * (f - 32.0));
	}
}
