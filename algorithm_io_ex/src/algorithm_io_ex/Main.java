package algorithm_io_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
	    int num = Integer.parseInt(bf.readLine());
	    for(int i=1;i<=num;i++) {
	    	for(int k=i;k<=num-1;k++) {
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i*2-1;j++) {
	    		if(j%2 == 1) {
	    			System.out.print("*");	    			
	    		}
	    		else System.out.print(" ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	}
}
