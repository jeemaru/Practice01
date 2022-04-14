package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("반지름:");
			long hf = sc.nextInt();
			
			double wid = 4.0/3.0*3.14*hf*hf*hf;
			
			System.out.println("구의부피는:"+wid);

		sc.close();
		
		
	}
    
}
