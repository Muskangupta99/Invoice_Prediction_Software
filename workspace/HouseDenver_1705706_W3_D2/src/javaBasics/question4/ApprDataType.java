package javaBasics.question4;
import java.util.*;
public class ApprDataType {
 public static void main(String args[]) {
	 LinkedHashMap<String,ArrayList<String>> input=new LinkedHashMap<String,ArrayList<String>>();
    Scanner s =new Scanner(System.in);
    int t=s.nextInt();
    try {
    while(t>0) {
    if(s.hasNextByte()){ //check if input is of byte type
    	    Byte n; //declare n according
       		 n = s.nextByte(); //storing values in 
       		input.put(Short.toString(n)+" can be fitted in:",new ArrayList<String>(Arrays.asList("byte","short","int","long")));
    	    }	
    else if(s.hasNextShort()){ //check if input is of short type
    	    short n; //declare n according
       		 n = s.nextShort();
       		input.put(Short.toString(n)+" can be fitted in:",new ArrayList<String>(Arrays.asList("short","int","long")));
    	    }
    	else if(s.hasNextInt()){ //check if input is of Int type
    		 int n; //declare n according
    		 n = s.nextInt();
    		input.put(Integer.toString(n)+" can be fitted in:",new ArrayList<String>(Arrays.asList("int","long")));
    	    }else if(s.hasNextLong()){ //check if input is of Long type
    	    	long n; //declare n according
          		 n = s.nextLong();
          		input.put(Long.toString(n)+" can be fitted in:",new ArrayList<String>(Arrays.asList("long")));
    	    }else{  //check if input is not of any type
    	        String n=s.next();
    	    	input.put(n+" can't be fitted anywhere",new ArrayList<String>(Arrays.asList()));
    	    }
     
     t--;
    }
    
    for(java.util.Map.Entry<String, ArrayList<String>> entry : input.entrySet()){
		
    	String inputNumber=entry.getKey();
		ArrayList<String> inputValues=entry.getValue();
		System.out.println(inputNumber);
		for(String inputType : inputValues) {
			System.out.println(inputType);
		}
		}
    }
    catch(Exception e) {
    	System.out.println("Exception Caught, this program takes care of numbers or even strings not fitting"
    			+ "anywhere, please try again");
    }
 }
}
