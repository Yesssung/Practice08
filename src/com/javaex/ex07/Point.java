package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	//equals() 메소드를 작성하세요.
	
	@Override
	// 두 객체가 같은지 아닌지를 판단하기 때문에 boolean으로 return
	public boolean equals(Object obj) {
		if(obj instanceof Point) { // obj Point로 캐스팅이 가능한지 확인해주셍
			Point other = (Point)obj; // 캐스팅 실행
			return x == other.x; 
		}
		return super.equals(obj);
	}

}
