package com.test;

import java.util.Random;

public class odd_even {
	public static void main(String args[]) {
		Random rn=new Random();
		int r=rn.nextInt(100 - 1) + 1;
		
		System.out.println(r);
		if(r%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}
}
