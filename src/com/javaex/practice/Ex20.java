package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("500원 개수: ");
			long 오백 = sc.nextInt();
			
			System.out.print("100원 개수: ");
			long 백 = sc.nextInt();
			
			System.out.print("50원 개수: ");
			long 오십 = sc.nextInt();
			
			System.out.print("10원 개수: ");
			long 십 = sc.nextInt();
			
			long 오백1 = 500*오백;
			long 백1 = 100*백;
			long 오십1 = 50*오십;
			long 십1 = 십*1;
					
			long total = 오백1+백1+오십1+십1;
			
			
			System.out.println("동전의 총합은 "+total+" 원 입니다.");
		
		sc.close();
			
	}
}
