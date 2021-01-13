package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_9461 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(bf.readLine());
		while(tcase-- > 0) {
			int num = Integer.parseInt(bf.readLine());
			long dp[] = new long[num];
			dp[0]= 1;
			if(num >1) dp[1] = 1;
			if(num >2) dp[2] = 1;
			for(int i=3;i<num;i++) {
				dp[i] = dp[i-2] + dp[i-3];
			}
			System.out.println(dp[num-1]);
		}
	}

}
