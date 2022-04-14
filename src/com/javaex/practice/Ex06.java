package com.javaex.practice;

public class Ex06 {

	public static void main(String[]args) {
		// args로 수정
		
		int i = 10;
		int n = i++%2;
		
		System.out.println(i); //10
		System.out.println(n); //5 실수값은 표현안됨
		
		
		/*int h = 10;
		int g = ++h; //꼭 프린트값이 없어도 나중에 계산되는것은 이전에 계산되는 식이 있을경우 적요이 되는걸 앎
		
		//System.out.println(h%2); h가 11었을떄 1 
		//System.out.println(h%2); h가 10이었을떄 0
		
		System.out.println(h%2);
		*/
		
		System.out.println(i);
		
		
	}
	
	
}
