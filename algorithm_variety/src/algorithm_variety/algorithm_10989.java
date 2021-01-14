package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class algorithm_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int input[] = new int[num];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			input[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(input);
		for(int i=0;i<num; i++) {
			sb.append(input[i]).append("\n");
		}
		System.out.println(sb);
		
	}

}
