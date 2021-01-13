package algorithm_dp;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		int num = Integer.parseInt(bf.readLine());
		//******* 가장 긴 감소하는 부분수열
		int[] arr = new int[num+1];
		int[] dp = new int[num+1];
		int max =0;
		String[] input = bf.readLine().split(" ");
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(input[i]);
			dp[i] = 1;
		}
		for(int i =0; i<num; i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j] > arr[i] && dp[j] >= dp[i]) {
					dp[i] = dp[j]+1;
				}
			}
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(max);
		
//		//******** 가장 큰 증가 부분수열
//		int[] arr = new int[num+1];
//		int[] dp = new int[num+1];
//		int max =0;
//		String[] input = bf.readLine().split(" ");
//		for(int i=1; i<=num; i++) {
//			arr[i] = Integer.parseInt(input[i-1]);
//		}
//		
//		for(int i=1; i<=num; i++) {
//			dp[i] = arr[i];
//			for(int j=1; j<i;j++) {
//				if(arr[i]>arr[j]) {
//					dp[i] = Math.max(dp[i], arr[i] + dp[j]);
//				}
//			}
//			if(max < dp[i]) {
//				max = dp[i];
//			}
//		}			
//		System.out.println(max);
		
//		//******* 가장 긴 증가하는 부분수열
//		int[] arr = new int[num+1];
//		int[] dp = new int[num+1];
//		int max =0;
//		String[] input = bf.readLine().split(" ");
//		
//		for(int i=0; i<num; i++) {
//			arr[i] = Integer.parseInt(input[i]);
//			dp[i] = 1;
//		}
//		for(int i =0; i<num; i++) {
//			for(int j=0;j<=i;j++) {
//				if(arr[j] < arr[i] && dp[j] >= dp[i]) {
//					dp[i] = dp[j]+1;
//				}
//			}
//			if(dp[i] > max) {
//				max = dp[i];
//			}
//		}
//		System.out.println(max);
		
		
		
		
//		//********** 포도주 마시기
//		long[] input = new long[num+1];
//		long[] dp = new long[num+1];
//		for(int i=1; i<=num; i++) {
//			input[i] = Integer.parseInt(bf.readLine());
//		}
//		if(num >= 1) {
//			dp[1] = input[1];			
//		}
//		if(num >= 2) {
//			dp[2] = input[1]+input[2];	
//		}
//		if(num >=3) {
//			for(int i=3;i<=num;i++) {
//				dp[i] = Math.max(dp[i-1], dp[i-3]+ input[i-1] + input[i]);
//				dp[i] = Math.max(dp[i], dp[i-2] + input[i]);
//			}
//			
//		}
//		System.out.println(dp[num]);
		
//		//******* 스티커 떼기
//		for(int i =0; i< num; i++) {
//			int tcase = Integer.parseInt(bf.readLine());
//			int[][] list = new int[2][tcase+1];
//			int[][] dp = new int[2][tcase+1];
//			int ans = 0;
//			for(int j =0; j<2;j++) {
//				String[] numbers = bf.readLine().split(" ");
//				for(int k=1; k<=tcase;k++) {
//					list[j][k] = Integer.parseInt(numbers[k-1]);
//				}
//				
//			}
//			
//			dp[0][1] = list[0][1];
//			dp[1][1] = list[1][1];
//			for(int j=2; j<=tcase; j++) {
//				dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + list[0][j];
//				dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + list[1][j];
//			}
//			System.out.println(Math.max(dp[0][tcase], dp[1][tcase]));
//			
//		}
		
		//******* 이친수
//		
//		long[][] dp = new long[94][2];
//		long ans=0;
//		
//		dp[0][0] = dp[0][1] = dp[1][0] = dp[2][0] = 0;
//		dp[1][1] = dp[2][1] = dp[3][0] =dp[3][1]= 1;
//		
//		for(int i=4; i<=num;i++) {
//			dp[i][0] = dp[i-1][0] + dp[i-1][1];
//			dp[i][1] = dp[i-1][0];
//		}
//		
//		
//		ans = dp[num][0] + dp[num][1];
//		
//		System.out.println(ans);
				
				
		// ***** 오르막
//		long[][] dp = new long[10001][11];
//		long ans = 0;
//		for( int i=0;i<=9;i++) {
//			dp[1][i] = 1;
//		}
//		for(int i =2; i<=num; i++) {
//			for(int j=0; j<= 9; j++) {
//				for(int k=j; k<=9;k++) {
//					dp[i][j] += dp[i-1][k];					
//				}
//				dp[i][j] = dp[i][j] % 10007;
//			}
//		}
//		for(int i=0;i<=9;i++) {
//			ans += dp[num][i];
//		}
//		System.out.println(ans % 10007);
		
		// ***** 계단수
//		long[][] dp = new long[101][11];
//		long ans = 0;
//		for( int i=1;i<=9;i++) {
//			dp[1][i] = 1;
//		}
//		for(int i =2; i<=num; i++) {
//			for(int j=0; j<= 9; j++) {
//				if(j==0) dp[i][j] = dp[i-1][1];
//				else if(j ==9) dp[i][j] = dp[i -1][8];
//				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
//				
//				dp[i][j] = dp[i][j] % 1000000000;
//			}
//		}
//		
//		for(int i=0;i<=9;i++) {
//			ans += dp[num][i];
//		}
//		System.out.println(ans % 1000000000);
//	    
	    // ******** 1만들기 1463
//	    int[] dp = new int[num+1];
//	    
//	    dp[0] = dp[1] = 0;
//	    for(int i=2;i<=num;i++) {
//	    	dp[i] = dp[i - 1] + 1;
//	    	if(i % 2 ==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
//	    	if(i%3 ==0) dp[i] = Math.min(dp[i], dp[i/3] +1);
//	    }
//	    
//	    System.out.println(dp[num]);
	    // ********* 2xn 타일
//	    int[] tile = new int[1001];
//	    tile[0] = 1;
//	    tile[1] = 1;
//	    
//	    for(int i=2; i<=num; i++ ) {
//	    	tile[i] = (tile[i-1] + tile[i-2] *2)%10007;
//	    }
//	    
//	    System.out.println(tile[num]);
	    
	    
	    //************ 1,2,3 더하기
//		int size = Integer.parseInt(bf.readLine());
//		for(int i=0; i<size;i++) {
//			int num = Integer.parseInt(bf.readLine());
//			
//			int[] number = new int[num + 3];
//			   number[0] = 0;
//			   number[1] = 1;
//			   number[2] = 2;
//			   number[3] = 4;
//			   for(int j=4; j<=num; j++) {
//				   number[j] = number[j-1] + number [j-2] + number[j-3];
//						   
//			   }
//			   System.out.println(number[num]);
//			}
		
		
		}

}
