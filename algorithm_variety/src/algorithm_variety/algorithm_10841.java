package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class algorithm_10841 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		String input[][] = new String[num][2];
		
		for(int i=0; i<num; i++) {
			String person = bf.readLine();
			StringTokenizer st = new StringTokenizer(person, " ");
			
			input[i][0] = st.nextToken();
			input[i][1] = st.nextToken();
		}
		
		Arrays.sort(input, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		for(int i=0; i<num; i++) {
			sb.append(input[i][0] + " " + input[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
