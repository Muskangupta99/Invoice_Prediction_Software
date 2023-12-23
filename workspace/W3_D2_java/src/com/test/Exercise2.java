package com.test;
import java.util.*;
public class Exercise2 {
	public static void main(String args[]) {
		
		Circle circle=new Circle();
		circle.setter("circle", "red");
		System.out.println(circle.getter());
		Random rn=new Random();
		int r=rn.nextInt(20 - 10) + 10;
		circle.getArea(r);
		
		Rectangle rect=new Rectangle();
		rect.setter("Rectangle", "blue");
		System.out.println(rect.getter());
		rect.getArea(5*10);
		
	}
}
