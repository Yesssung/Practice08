package com.javaex.ex05;

public class Sub {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.setA(a);
    	this.setB(b);
    }

    public int calculate() {
    	return this.a - this.b;
    }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
