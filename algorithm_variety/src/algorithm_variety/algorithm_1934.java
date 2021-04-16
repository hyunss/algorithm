package algorithm_variety;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_1934 {
	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine());
	        for(int i=0; i<T; i++) {
	        	StringTokenizer st = new StringTokenizer(br.readLine());
		        int a = Integer.parseInt(st.nextToken());
		        int b = Integer.parseInt(st.nextToken());
		        int gcd = getGCD(Math.max(a, b), Math.min(a, b));
		        int lcm = getLCM(a, b, gcd);
		        System.out.println(lcm);
	        }    
	 }
	 public static int getGCD(int a, int b) {
		 while(b>0) {
			 int temp = a;
			 a = b;
			 b = temp % b;
		 }
		 return a;
	 }
	 public static int getLCM(int a, int b, int gcd) {
		 return (a*b)/gcd;
	 }
}
