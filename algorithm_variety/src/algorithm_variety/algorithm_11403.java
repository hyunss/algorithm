package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algorithm_11403 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int input[][] = new int[num][num];
		StringTokenizer st;
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0; j<num; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int k=0; k<num; k++) {
			for(int i=0; i<num; i++) {
				for(int j=0; j<num; j++) {
					if(input[i][k] == 1 && input[k][j] == 1) {
						input[i][j] = 1;
					}
				}
			}
		}
		for(int i=0; i< num; i++) {	
			for(int j=0; j<num; j++) {
				sb.append(input[i][j] + " " );
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
