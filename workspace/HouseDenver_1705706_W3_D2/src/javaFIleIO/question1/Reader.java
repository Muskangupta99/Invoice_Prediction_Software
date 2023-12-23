package javaFIleIO.question1;
import java.io.*;
import java.util.*;
public class Reader {
	public static void main(String[] args) {
		FileReader r=null;
		BufferedReader bfr=null;
		Writer wtr=null;
		BufferedWriter bfwtr=null;
		try {
			
			r=new FileReader("C:\\workspace\\HouseDenver_1705706_W3_D2\\src\\javaFIleIO\\question1\\Test_In.txt");
			bfr = new BufferedReader(r);
			
			wtr=new FileWriter("C:\\\\workspace\\\\HouseDenver_1705706_W3_D2\\\\src\\\\javaFIleIO\\question1\\Test_out.txt");
			bfwtr = new BufferedWriter(wtr);
			//to store last five lines
			ArrayList<String> buffer = new ArrayList<String>();
			String nextLine=null;
			while((nextLine=bfr.readLine()) !=null) {
				buffer.add(nextLine); 
	            if (buffer.size() == 6)
	                buffer.remove(0); //remove one line if number of lines exceeds 5 to get last five lines
			}
			
			for (int i=0;i<buffer.size();i++) {
				bfwtr.write(buffer.get(i)); //copy last five lines in Test_Out
				bfwtr.newLine();
			}
	            

			
		}
		catch(Exception e) {
			System.out.println("Exception has occured");
			
		} //catching exceptions if files weren't available and hence can't be closed
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