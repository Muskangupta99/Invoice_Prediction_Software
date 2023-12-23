import java.util.*;
import java.lang.Math;
class MyCalculator{
	long power(long num1, long num2) {
		try {
			if(num1<0 || num2<0) {
				throw new java.lang.Exception("n or p should not be negative");
			}
			else if(num1==0 || num2==0) {
				throw new java.lang.Exception("n or p should not be zero");
			}
				
		}
		catch(java.lang.Exception le) {
			System.out.println(le);
		}
		return (long) Math.pow(num1,num2);
		
	}
}
public class JavaBasics_Question3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		long num1=s.nextLong();
		long num2=s.nextLong();
		MyCalculator mc=new MyCalculator();
		System.out.println(mc.power(num1,num2));
	}
}
