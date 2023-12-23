<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
</head>
<body>
<script>
jQuery(document).ready(function(){
 
var data ='<%= request.getAttribute("cust_json") %>';   
     
jQuery('#actiontables').DataTable( {
        data: data,
        columns: [
        	
        	{
        	      "data": "acct_doc_header_id",
        	      "title": "Account Doc Header ID",
        	      "bSortable": true
        	    },
        	    
        	    {
          	      "data": "company_id",
          	      "title": "Company ID",
          	      "bSortable": true
          	    },
          	  {
          	      "data": "business_code",
          	      "title": "Business Code",
          	      "bSortable": true
          	    },
          	 
           
        ]
    } ); 
 
}); </script>
<table id="actiontables" "class="row-border" width="100%"></table>
'<%= request.getAttribute("cust_json") %>'
</body>
</html>