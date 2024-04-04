package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		// numLine을 split해서 공백을 만들어준다.
		String[] data = numLine.split(" "); // 입력받은 수를 배열형태로 만들어서
		
		for(int i = 0; i < data.length; i++ ) { // 배열이 나왔기 때문에 loop생성 가능
//			 int num = Integer.parseInt(data[i]);
			int num = Integer.parseInt(data[i]);
			 sum += num;
		}
		
		
		System.out.println("합:" + sum);
		

		
		sc.close();
	}

}
