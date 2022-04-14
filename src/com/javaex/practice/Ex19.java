package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
			//1d-86400c yer-31536000c
		    long c = 300000;
			long d = c*86400;
			long y = d*365;
			
			System.out.println("빛이 1년 동안 가는 거리는"+y +" Km 입니다.");
		
		sc.close();
		
	}
    
}

