//다음 코드에서 변수로 사용할 수 없는 경우 이유를 작성하세요.
package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		
//		true는 예약어라서 사용 불가
//		int true;
		int t1 = 1;
//		특수문자 사용 불가 
		
//		int #_of_workers;
		int ofWorkers;
		
//		예약어는 식별자로 사용 불가 
//		int countOfLettersInString;
		int count;
		
//		숫자로 시작 불가 
//		int 1stLevel1;
		int first;
		
//		특수문자 사용 불가 
//		int person#;
		int person;
		
//		$와 _는 예외로 사용 가능 
//		int _person;
		int _person;
		
		
		System.out.println(t1);
	}
}
