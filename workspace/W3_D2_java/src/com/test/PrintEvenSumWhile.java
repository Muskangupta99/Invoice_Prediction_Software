package com.test;
import java.util.*;
public class PrintEvenSumWhile {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=s.nextInt();
		System.out.println("Enter second number : ");
		int num2=s.nextInt();
		int sum=0;
		try {
			if(num1>num2)
				throw new ArithmeticException("First number should be smaller");
			else {
				if(num1%2!=0)
					num1+=1;
				int i=num1;
				while(i<=num2) {
						sum+=i;
						i+=2;
				}
				System.out.println("Sum "+sum);
			}
		}
		catch(ArithmeticException ar){
			System.out.println(ar);
			}
		catch(Exception e) {
			System.out.println("Something's not right, exception caught");
		}
		
	}
}
