package com.test;
import java.util.*;
public class ObjectType {
	public static void main(String args[]) {
	Object typeunknown;
	Scanner s =new Scanner(System.in);
	typeunknown=s.nextObject();
    if(typeunknown instanceof Integer) {
    	System.out.println("Integer");
    }
    else
    	System.out.println("Doesn't work for this case");
}
}