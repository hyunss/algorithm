package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class algorithm_1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int count =0;
		int dp[] = new int[num+1]; 
		
		for(int i=1;i<=num;i++) {
			dp[i] = i;
			for(int j=1;j*j<=i;j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		System.out.println(dp[num]);
	}

}
