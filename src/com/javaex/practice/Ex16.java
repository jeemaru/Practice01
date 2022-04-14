package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	

		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
				System.out.print("상품가격:");
				long pl = sc.nextInt();
				
				System.out.print("받은돈:");
				long mo = sc.nextInt();
				
				double sel = pl/10;
				double lco = mo-pl;
				
				System.out.println("==========");
				System.out.println("받은돈:"+mo);
				System.out.println("상품가격: "+pl);
				System.out.println("부가세: "+sel);
				System.out.println("잔액: "+lco);
			
			sc.close();
			
			
		}
        
	}
		
	

