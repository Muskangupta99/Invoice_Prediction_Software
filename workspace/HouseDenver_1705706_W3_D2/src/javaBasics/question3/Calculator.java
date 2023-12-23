package javaBasics.question3;
import java.util.*;
import java.lang.Math;
class MyCalculator{
	long power(long n, long p) {
		try {
			if(n<0 || p<0) { //throwing exception for negative number
				throw new java.lang.Exception("n or p should not be negative");
			}
			else if(n==0 || p==0) { //throwing exception for negative number
				throw new java.lang.Exception("n or p should not be zero");
			}
			else  //if no exceptions are found, return the power
				return (long) Math.pow(n,p);
				
		}
		catch(java.lang.Exception le) {
			System.out.println(le);
			return 0; //if an exception is caught then return 0 as an indicator as the minimum 
			           // that is anything to power 0 is 1 
		}
		
		
	}
}
public class Calculator {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		//to take input all at once
		LinkedHashSet<ArrayList<Long>> input=new LinkedHashSet<ArrayList<Long>>();
		//Enter number of text cases : first input line
		int T=0;
		try {
        T=s.nextInt();
		while(T>0) {
			//Enter n and p: second input line space separated
			long n=s.nextLong();
			long p=s.nextLong();
			input.add(new ArrayList<Long>(Arrays.asList(n,p)));
		
		T--;
		}
		Iterator it = input.iterator();
		while(it.hasNext()){
			MyCalculator mc=new MyCalculator();
			ArrayList inputValues=new ArrayList();
			inputValues=(ArrayList) it.next(); //get ArrayList from set
			long answer=mc.power((long)inputValues.get(0),(long)inputValues.get(1));
			if(answer!=0) //if no exception is there print answer
			System.out.println(answer);
		}
		}
		catch(Exception e) {
			System.out.println("Please enter 2 space separated numbers only,you've a long range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
		}
	}
}
