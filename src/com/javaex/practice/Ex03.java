//아래의 출력결과를 예상하여 작성하세요.

package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		//++가 앞에 있으니까 x값 1 증가 후 -> x=2 --> 2*2가 a에 담김 
		
		int b = y++ *2;
		//++가 뒤에 있으니, y값이 그다음에 증가 --> 1*2 = 2가 b에 담기고 y는 2가 되어 있음 
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
