package javaFIleIO.question5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;  
import java.util.*;
public class CsvReaderUnordered 
{  
	 public static void main(String[] args)   
	{  
		FileReader r=null;
		BufferedReader bfr=null;
		Writer wtr=null;
		BufferedWriter bfwtr=null;
	try   
	{  
	//parsing a CSV file into BufferedReader 
		r=new FileReader("C:\\workspace\\HouseDenver_1705706_W3_D2\\src\\javaFIleIO\\question4\\TestCsv.csv");
		bfr = new BufferedReader(r);
		//Initializing BufferWriter with Test_Out
		wtr=new FileWriter("C:\\\\workspace\\\\HouseDenver_1705706_W3_D2\\\\src\\\\javaFIleIO\\question5\\Test_out.txt");
		bfwtr = new BufferedWriter(wtr);
		//Store the column names in a map as order is unknown
		LinkedHashMap<Integer,String> order_of_column =new LinkedHashMap<Integer,String>();
	    String nextLine=null;
	    int count=0;
	    while ((nextLine = bfr.readLine()) != null)   
	    {  
		String[] data = nextLine.split(","); 
		if(count==0) {
			for(int i=0;i<data.length;i++)
	    	 order_of_column.put(i,data[i]); //storing column order and names
	    	count++;
	    	continue;
	    	
	    }
		System.out.println("Row "+count);
		//Printing the extracted column name in order and the corresponding data
		String tostore= order_of_column.get(0) +": "+ data[0]+","+ order_of_column.get(1)+" :"+data[1]+" ,"+order_of_column.get(2)+" :"+data[2]+" ,"+order_of_column.get(3)+" :"+data[3]+", "+order_of_column.get(4)+" :"+data[4];
		System.out.println(tostore);
		//copying the data to Test_Out
		bfwtr.write(tostore);
		bfwtr.newLine();
		}  
	}   
	catch (Exception e)   
	{  
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

