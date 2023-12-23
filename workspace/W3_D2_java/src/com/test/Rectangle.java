package com.test;

public class Rectangle extends Shape implements IArea {
	
	public void getArea(int l,int b) {
		System.out.println("Rectangle Area : "+ l*b);
	}
	public void getArea(int r) {
		System.out.println("please enter two values");
	}
	
	
}