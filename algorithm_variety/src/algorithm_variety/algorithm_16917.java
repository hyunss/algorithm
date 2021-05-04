package algorithm_variety;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_16917 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); //양념 가격 
        int b = Integer.parseInt(st.nextToken()); //후라이드 가격 
        int c = Integer.parseInt(st.nextToken()); // 반반 가격 
        int x = Integer.parseInt(st.nextToken()); //양념 최소 
        int y = Integer.parseInt(st.nextToken()); //후라이드 최소 
        
        int min = 0;
        int k =0;
        if(c*2 < a+b) {
        	k = Math.min(x, y);
        	if(k == y) {
        		min = c*2*k + a * (x-k);
        	}
        	else {
        		min = c*2*k + b * (y-k);
        	}
        	
        }
        else {
        	 min = a * x + b * y;
        }
        int temp = 0;
        if(x>y) {
        	temp = x*2*c;
        }
        else {
        	temp = y*2*c;
        }
        min = Math.min(temp, min);
        System.out.println(min);
	 }
}
