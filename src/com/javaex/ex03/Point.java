package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} 

	// toString()을 작성 하세요
	// toString()을 오버라이드 하지 않으면 해쉬코드가 출력된다.
	
	@Override
	public String toString() {
		return "[Point] x: " + x + ", y: " + y + " 입니다.";
//		return String.format("[포인트] x: %d, y: %d 입니다. %n", x, y);
		// return 시 (return String.format = System.out.printf) 
	}



}
