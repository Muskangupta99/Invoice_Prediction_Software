package com.test;
import java.io.*;
public class Write {
	public static void main(String[] args) {
		Writer wtr=null;
		BufferedWriter bfwtr=null;
		try {
			wtr=new FileWriter("D:\\testout.txt");
			bfwtr = new BufferedWriter(wtr);
			String s1="1705706";
			String s2="Welcome to HighRadius";
			bfwtr.write(s1);
			bfwtr.newLine();
			bfwtr.write(s2);
			
		}
		catch(Exception e) {
			System.out.println("Exception has occured");
			
		}
		finally {
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
				System.out.println("Could not close writer");
			}
		}
	}

}
