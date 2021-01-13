package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_11052 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String P[] = bf.readLine().split(" ");
		int input[] = new int[num+1];
		
		int dp[] = new int[num+1];
		
		for(int i=1;i<=num;i++) {
			input[i] = Integer.parseInt(P[i-1]);
		}
		dp[0] = 0;
		dp[1] = input[1];
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++){
			dp[i] = Math.max(dp[i-j] + input[j], dp[i]);
			}
		}
		
		System.out.println(dp[num]);			
	}
}
