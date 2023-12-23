package com.test;

public abstract class Shape {
	String name,color;
	public void setter (String s,String c) {
		name=s;
		color=c;
	}
	
	public String getter () {
		return name +"  "+ color;
	}

}
