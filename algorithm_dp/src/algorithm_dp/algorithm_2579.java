package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_2579 {
	public static int Max(int a, int b) {
		if(a>=b) {
			return a;
		}
		else return b;
	}
	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(bf.readLine());
		 int arr[] = new int[num+1];
		 int dp[] = new int[num+1];
		 
		 for(int i=1; i<=num; i++) {
			 arr[i] = Integer.parseInt(bf.readLine());
		 }
		 
		 dp[0] = arr[0] = 0;
		 dp[1] = arr[1];
		 if(num>1) {dp[2] = arr[1]+arr[2];}
		 
		 
		 for(int i=3;i<=num;i++) {
			 int a = dp[i-3]+ arr[i-1] + arr[i];
			 int b = dp[i-2] + arr[i];
			 dp[i] = Max(a,b);
		 }
		 System.out.println(dp[num]);
		 
	}

}
