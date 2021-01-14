package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class algorithm_11652 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		long[] input = new long[num];
		for(int i=0; i<num; i++) {
			input[i] = Long.parseLong(bf.readLine());
		}
		Arrays.sort(input);
		
		long ans = input[0];
		int count = 1,max =1 ;
		for(int i=1; i<num; i++) {
			if(input[i] == input[i-1]) count++;
			else count = 1;
			if(max < count) {
				max = count;
				ans = input[i];
			}
			
		}
		System.out.println(ans);
	}

}
