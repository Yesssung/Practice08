package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // == 은 참조하는 주소가 같은지 여부
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2)); // equals는 내부 데이터가 같은지 알아보는건데 동등성 비교하는 코드를 만들지 않았기 때문에 false가 출력된다.
		System.out.println(p4.equals(p1));
	}

}


