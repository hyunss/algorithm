package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_11655 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			int rot = input.charAt(i);
			
			if(rot >= 65 && rot <= 90) {
				 rot += 13;
				 if(rot > 90) {
					 rot -= 26;
				 }
			}
			else if (rot >= 97 && rot <= 122) {
				 rot += 13;
				 if(rot > 122) {
					 rot -= 26;
				 }
			}
			sb.append((char)rot);
		}
		System.out.println(sb);
	}
}
