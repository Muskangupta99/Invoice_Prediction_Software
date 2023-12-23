package com.test;
import java.io.*;
public class Read {
	public static void main(String[] args) {
		Reader r=null;
		BufferedReader bfr=null;
		try {
			r=new FileReader("D:\\testout.txt");
			bfr = new BufferedReader(r);
			String nextLine=null;
			while((nextLine=bfr.readLine()) !=null) {
				System.out.println(nextLine);
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
		}
	}

}