package com.test;

public class Student {
	public static void main(String args[]) {
		String[] Student_name = {"Harry","Ron","Malfoy"};
		int[] marks = {80,90,100};
		try {
			
			System.out.println(Student_name[4]);
			throw new ArithmeticException("Catch me");
		}
		
		
		catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("Student not present");
		}
		
		catch(Exception e) {
			System.out.println("Caught Exception ");
		}
	}

}
