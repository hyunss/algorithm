package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] count = new int[26];
		
		for(int i=0; i<count.length; i++) {
			count[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<alpha.length; j++) {
				if(input.charAt(i) == alpha[j] && count[j] == -1) {
					count[j] = i;
				}
			}
			
		}
		for(int i=0; i<count.length;i++) {
			System.out.print(count[i] + " ");
		}
	}
}
