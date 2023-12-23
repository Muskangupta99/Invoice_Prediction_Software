package Assignment;
import java.util.*;
public class AddTwoNums {
	public static void main(String args[]) {
		Adder adding=new Adder();
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		adding.add(num1,num2);
	}
}

