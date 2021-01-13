package algorithm_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_2225 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long dp[][] = new long[201][201];
	
		for(int i=0;i<=N;i++) {
	        dp[1][i] = 1;
		}
		for(int i=2;i<=K;i++) {
			for(int j=0; j<=N;j++) {
				for(int L=0; L<=j; L++) {
					dp[i][j] = (dp[i][j] + dp[i-1][j-L]) % 1000000000;
				}
			}
		}
		
		System.out.println(dp[K][N]);
	}

}
