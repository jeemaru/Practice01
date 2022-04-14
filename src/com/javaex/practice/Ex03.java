package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[]args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x*2;
		int b = y++*2;
		
		System.out.println("a=" +a); //4
		System.out.println("b=" +b); //2
		System.out.println("x=" +x); //1 ->2
		System.out.println("y=" +y); //1 ->2
		
		// a,b값을 다른값과연동해도 안바뀌는걸 확인함
		
	}
	
}
