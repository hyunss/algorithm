package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_2011 {

	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		long dp[] = new long[input.length()+1];
		dp[0]=1;
	    dp[1]=1;
		if(input.charAt(0) == '0') {
			System.out.println(0);
	        return;
		}
		
		for(int i=1; i<input.length(); i++) {
			char p = input.charAt(i-1);
			if(input.charAt(i) >= '1' && input.charAt(i) <= '9') {
				dp[i+1]+=dp[i];
	            dp[i+1]%=1000000;
			}
			if (!(p == '0' || p > '2' || (p == '2' && input.charAt(i) > '6'))) {
	               //두글자가 될 수 있다면
	               dp[i + 1] += dp[i-1];
	               dp[i+1]%=1000000;
	        }
			dp[i + 1] %= 1000000000;
		}
		System.out.println(dp[input.length()] % 1000000000);
		
	}

}
