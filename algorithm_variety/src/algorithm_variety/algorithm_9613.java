package algorithm_variety;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_9613 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        for(int i =0; i<t; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int inputCase = Integer.parseInt(st.nextToken());
        	int[] input = new int[inputCase];
        	
        	for(int j=0; j<inputCase; j++) {
        		input[j] = Integer.parseInt(st.nextToken());
        	}
        	long gcdSum = 0;
        	for(int j=0; j<inputCase-1; j++) {
        		for(int k= j +1; k<inputCase; k++) {
        			gcdSum += getGCD(input[j], input[k]);
        		}
        	}
        	System.out.println(gcdSum);
        }
	 }
	 public static long getGCD(long a, long b) {
		 while(b>0) {
			 long temp = a;
			 a = b;
			 b = temp % b;
		 }
		 return a;
	 }
}
