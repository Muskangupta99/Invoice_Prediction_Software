package javaBasics.question1;

import java.util.Scanner;
import java.util.*;
class Arithmetic {
	void add(int num1,int num2) {
	 System.out.println(num1+num2);
	}
}


class Adder extends Arithmetic{
 
}


public class Adding{
	public static void main(String args[]) {
		Adder adding=new Adder(); //add() using Adder class object
		try {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt(); //take input for first number
		int num2=s.nextInt(); //take input for second number
		adding.add(num1,num2); //child class access the method of parent class
		}
		catch(Exception e) {
			System.out.println("Try putting valid inputs, Exception Caught");
		}
	}
}
