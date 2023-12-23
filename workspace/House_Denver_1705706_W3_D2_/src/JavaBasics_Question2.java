import java.util.*;
abstract class Book{
	protected String title;
	abstract void setTitle(String s);
	void getTitle(){
		System.out.println("The title is: " + title);
	}

}
class MyBook extends Book{
	void setTitle(String s) {
		title=s;
	}
}
public class JavaBasics_Question2 {
	public static void main(String args[]) {
		MyBook book=new MyBook(); 
		Scanner s=new Scanner(System.in);
		String book_name=s.nextLine();
		
		book.setTitle(book_name);//calling setTitle from MyBook;
		book.getTitle();
	}
}
