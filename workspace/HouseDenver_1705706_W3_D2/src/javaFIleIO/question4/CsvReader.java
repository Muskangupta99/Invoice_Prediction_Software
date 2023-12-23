package javaFIleIO.question4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;  
public class CsvReader 
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
		wtr=new FileWriter("C:\\\\workspace\\\\HouseDenver_1705706_W3_D2\\\\src\\\\javaFIleIO\\question4\\Test_out.txt");
		bfwtr = new BufferedWriter(wtr);
		
		
	    String nextLine=null;
	    int count=0;
	    while ((nextLine = bfr.readLine()) != null)   
	    {  if(count==0) {
	    	count++;
	    	continue;
	    }
		String[] data = nextLine.split(","); //split the csv line from delimiter ','
		//displaying the results
		System.out.println("Row "+count); 
		//create string to store
		String tostore=" FirstName : " + data[0]+" LastName : "+data[1]+" Serial : "+data[2]+" Alias : "+data[3]+" Quote : "+data[4];
		System.out.println(tostore);
		//storing the string in output file
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

