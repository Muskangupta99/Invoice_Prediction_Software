import java.util.Scanner;

class Arithmetic {
	public void add(int num1,int num2) {
	 System.out.println(num1+num2);
	}
}


class Adder extends Arithmetic{
 
}


public class JavaBasics_Question1 {
	public static void main(String args[]) {
		Adder adding=new Adder(); //add() using Adder class object
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		adding.add(num1,num2);
	}
}
