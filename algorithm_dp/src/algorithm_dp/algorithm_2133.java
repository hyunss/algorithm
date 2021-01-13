package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_2133 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int dp[] = new int[num+1];
		dp[0] = 1;
        dp[1] = 0;
		if(num >1) dp[2] = 3;
		for(int i=4;i<=num; i++) {
			dp[i] = dp[i-2] * 3;
			for (int j = 4; j <= i; j += 2)
	        {
	            dp[i] += dp[i - j] * 2;
	        }
		}
		System.out.println(dp[num]);
	}
}
