package algorithm_variety;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_1850 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        long gcd = getGCD(Math.max(a, b), Math.min(a, b));
        
        for(int i=0; i<gcd; i++) {
        	sb.append("1");
        }
        
        System.out.println(sb);
	 }
	 public static long getGCD(long a, long b) {
		 while(b>0) {
			 long temp = a;
			 a = b;
			 b = temp % b;
		 }
		 return a;
	 }
}