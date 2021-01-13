package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class algorithm_11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[][] input = new int[num][2];
		
		
		for (int i = 0; i < num; i++) {
			String xy = bf.readLine();
			StringTokenizer st = new StringTokenizer(xy, " ");
			input[i][0] = Integer.parseInt(st.nextToken());
			input[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(input, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		for(int i=0; i<num; i++) {
			sb.append(input[i][0] + " " + input[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
