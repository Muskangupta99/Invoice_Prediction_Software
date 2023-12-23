package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class UploadData {
public static void main(String[] args){
	Connection dbCon=null;
	String query=null;
	Statement stmt=null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	String url="jdbc:mysql://localhost:3306/project";
    try {
    	Class.forName("com.mysql.jdbc.Driver");
         dbCon= DriverManager.getConnection(url, "root", "root");
        stmt = dbCon.createStatement();
        query = "LOAD DATA INFILE 'D:\\\\Document\\\\Highradius summer internship\\\\Data Uploading.csv' INTO TABLE customer_invoice FIELDS ENCLOSED BY '\"' TERMINATED BY ',' ESCAPED BY '\"' LINES TERMINATED BY '\\r\\n'";
        pstmt=dbCon.prepareStatement(query);
        rs = pstmt.executeQuery();   
    } catch (Exception e) {
        System.out.println(e);
    }
   
    
    }
}