package javaFIleIO.question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class ModifyWhiteSpace {
	public static void main(String args[]) {
	FileReader r=null;
	BufferedReader bfr=null;
	Writer wtr=null;
	BufferedWriter bfwtr=null;

	
	try {
		r=new FileReader("C:\\workspace\\HouseDenver_1705706_W3_D2\\src\\javaFIleIO\\question2\\Test_In.txt");
		bfr = new BufferedReader(r);
		
		wtr=new FileWriter("C:\\\\workspace\\\\HouseDenver_1705706_W3_D2\\\\src\\\\javaFIleIO\\question2\\Test_out.txt");
		bfwtr = new BufferedWriter(wtr);
		
		
		
		String nextLine=null;
		
	
		while((nextLine=bfr.readLine()) !=null) {
			System.out.println((nextLine.replaceAll("\\s", ""))); //removing the space from the lines/strings
			bfwtr.write(nextLine.replaceAll("\\s", "")); //copying line with no white space in Test_out
			bfwtr.newLine();
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

