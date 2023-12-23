package javaBasics.question2;
import java.util.Scanner;
abstract class Book{
	protected String title;
	abstract void setTitle(String s); //abstract function
	void getTitle(){
		System.out.println("The title is: " + title);
	}

}
class MyBook extends Book{
	void setTitle(String s) {
		title=s; //setting title to title variable of parent class Book
	}
}
public class BookCLass {
	public static void main(String args[]) {
		MyBook book=new MyBook(); 
		Scanner s=new Scanner(System.in);
		try {
		String book_name=s.nextLine();
		
		book.setTitle(book_name);//calling setTitle from MyBook;
		book.getTitle();
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
}
