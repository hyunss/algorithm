package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_1912 {

	public static void main(String[] args) throws IOException{
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(bf.readLine());
		 
		 int[] arr = new int[num+1];
		 int[] dp = new int [num+1];
		 
		 String[] input = bf.readLine().split(" ");
			
		 for(int i=0; i<num; i++) {
		 	 arr[i] = Integer.parseInt(input[i]);
			 dp[i] = 0;
		 }
		 dp[0] = arr[0];
		
		 for(int i=1; i<num; i++) {
			 
			 dp[i] = Math.max(arr[i], arr[i] + dp[i-1]);
		 }
		 int max =0;
		 
		 for(int i=0; i<num; i++) {
			 if(max <= dp[i]) {
				 max = dp[i];
			 }
		 }
		 System.out.println(max);

	}
	

}
