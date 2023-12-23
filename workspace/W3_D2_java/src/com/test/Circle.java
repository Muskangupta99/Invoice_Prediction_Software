package com.test;

public class Circle extends Shape implements IArea {
	
	public void getArea(int r) {
		System.out.println("Circle Area : " + 3.14*r*r);
	}
	
	public void getArea(int r,int r1) {
		System.out.println("please enter single value");
	}
	
	
}
