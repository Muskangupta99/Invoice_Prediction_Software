package com.test;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testdate {
	public static void main(String args[]) {
		DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat inputFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		String inputText = "02/04/2018";
		
		Date date;
		if (inputText.matches("\\d{2}-\\d{2}-\\d{4}")) {
		    
		
		try {
			date = inputFormat.parse(inputText);
			String outputText = outputFormat.format(date);
			System.out.println(outputText);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
		}
		
		
	}
		else if(inputText.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")){
			
			try {
				date = inputFormat2.parse(inputText);
				String outputText = outputFormat.format(date);
				System.out.println(outputText);
				java.sql.Date date2=java.sql.Date.valueOf(outputText);
				System.out.println(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				
			}
		}
		String data[]={"A","B"};
		System.out.println(data.length);
		
}
}
