package com.javaex.practice;

public class Ex04 {

	public static void main(String[]args) {
		//agrgs -> args 수정
		
		/*
		int x,y
		x = 10
		y = 20
		  같은열도 아니도 한꺼본에 부여됨 */
		
		int x = 10;
		int y = 20;
		
		//sum = x + y 앖에 정수값이 빠짐
		
		int sum = x+y;
		
		//System.out.println("합은' + sum) 따옴표 하나가 잘못됨
		System.out.println("합은" + sum);
		
	}
	
}
