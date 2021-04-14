package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_10820 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int[] count;
		
		while((input = bf.readLine()) != null) {
			count = new int[4];
			for(int i=0; i<input.length(); i++) {
				int asc = input.charAt(i);
				if(asc >= 65 && asc <= 90) {
					count[1]++; //대문자 
				}
				else if(asc >= 97 && asc <= 122) {
					count[0]++; //소문자 
				}
				else if(asc >= 48 && asc <= 57) {
					count[2]++; //숫자
				}
				else count[3]++; //공백
			}
			for(int i=0; i<count.length; i++) {
				System.out.print(count[i] + " ");
			}
			System.out.println();
		}
	}
}
