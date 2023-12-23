package javaBasics.question5;
import java.security.KeyStore.Entry;
import java.lang.Math;
import java.util.*;
public class Series {
	public static void main(String args[]) {
		//hashmap to store take input together and then show output
		LinkedHashMap<Integer,ArrayList<Double>> input=new LinkedHashMap<Integer,ArrayList<Double>>();
		Scanner s=new Scanner(System.in);
		double a,b,n,tempsum=0;
		int q=0,qtemp=q,key=1;
		try {
		q=s.nextInt(); //number of queries input
		while(q>0) {
			
			a=s.nextInt();
			b=s.nextInt();
			n=s.nextInt();
			//store in the map
			input.put(key,new ArrayList<Double>(Arrays.asList(a,b,n)));
			q--;
			key++;
		}
		for(java.util.Map.Entry<Integer, ArrayList<Double>> entry : input.entrySet()){
			//(a+2^0*b),(a+2^0*b+2^1*b),.............................,(a+2^0*b+2^1*b+2^(n-1)*b)
			ArrayList<Double> inputValues=entry.getValue();
			a=inputValues.get(0);
			b=inputValues.get(1);
			n=inputValues.get(2);
			int p_2=0; //initializing power of two
			tempsum=a+(Math.pow(2,p_2)*b);
			for(p_2=1;p_2<=n;p_2++) { //updating power of two
				System.out.print((int)tempsum+" "); //printing previous term
				tempsum+=Math.pow(2,p_2)*b; 
				
			}
			System.out.println("");
		}
			
		}
		catch(Exception e) {
			System.out.println("Please Enter numbers! Enter your input again ");
		}
			
			
		}
		
	}


