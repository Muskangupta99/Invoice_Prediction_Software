package javaFIleIO.question3;
import java.lang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class ModifyCapitalize {
	public static void main(String args[]) {
	FileReader r=null;
	BufferedReader bfr=null;
	Writer wtr=null;
	BufferedWriter bfwtr=null;

	
	try {
		r=new FileReader("C:\\workspace\\HouseDenver_1705706_W3_D2\\src\\javaFIleIO\\question3\\Test_In.txt");
		bfr = new BufferedReader(r); //initialize BufferReader
		
		wtr=new FileWriter("C:\\\\workspace\\\\HouseDenver_1705706_W3_D2\\\\src\\\\javaFIleIO\\question3\\Test_out.txt");
		bfwtr = new BufferedWriter(wtr); //initialize Writer
		
		
		
		String nextLine=null;
		
	
		while((nextLine=bfr.readLine()) !=null) {
			String words[]=nextLine.split(" "); //splitting by white space to get words in a line
			for(String s: words) { //for all the words extracted in words array 
				s=Character.toUpperCase(s.charAt(0)) + s.substring(1)+" "; //capitalizing only the first letter
				//and adding rest of the substring to it
				System.out.print(s);
				bfwtr.write(s); //writing in Test_Out
				
			}
			System.out.println();
			
		}
		
		
		
	}
	catch(Exception e) {
		System.out.println("Exception has occured");
      }
	finally {
		try {
			if(bfr!=null) {
				bfr.close();
			}
		}
		catch(Exception e) {
			System.out.println("Could not close buffered reader");
		}
		try {
			if(r!=null) {
				r.close();
			}
		}
		catch(Exception e) {
			System.out.println("Could not close reader");
		}
		try {
			if(bfwtr!=null) {
				bfwtr.close();
			}
		}
		catch(Exception e) {
			System.out.println("Could not close buffered writer");
		}
		try {
			if(wtr!=null) {
				wtr.close();
			}
		}
		catch(Exception e) {
			System.out.println("Could not close reader");
		}
	}
}

}

