package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[]args) {
		
		//string[] argrgs --> args 로 수정
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1<n2); // 인트값에 숫자는 맞는데 참거짓을 표현할라면 단일적으론 아닌듯함
		
		String n3 = "#_of_workers";
		System.out.println(n3); // 인트값엔 숫자가 들어감 하지만 앞에 오는 특수문자도 포함이 안됨
		
		String n4 = "countOfLetterslnString"; //int값에는 글자가 적어서 안됨, 하지만 문장을 해석하면 글자수를 세는것으로는 가능함
		System.out.println(n4);
		
		String n5 = "person#"; // 문자가 오면 안되고, 특수문자도 안됨
		System.out.println(n5);
		
		String n6 = "_person";//언더바는 되지만, 문자가 오면 안되용
		System.out.println(n6);
		
		//어떻게 해답을 원하시는지 명확한 설명이나 예시가 없어서 추측해서 써봅니다
		
	} 

}
