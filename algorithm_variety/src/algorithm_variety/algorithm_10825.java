package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class algorithm_10825 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String input[][] = new String[num][4];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			String person = bf.readLine();
			StringTokenizer st = new StringTokenizer(person, " ");
			
			input[i][0] = st.nextToken();
			input[i][1] = st.nextToken();
			input[i][2] = st.nextToken();
			input[i][3] = st.nextToken();
		}
		
		Arrays.sort(input, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s2[1])==Integer.parseInt(s1[1])) {
					if(Integer.parseInt(s2[2]) == Integer.parseInt(s1[2])) {
						if(Integer.parseInt(s2[3]) == Integer.parseInt(s1[3])) {
							return s1[0].compareTo(s2[0]);
						}
						else {
							return Integer.parseInt(s2[3])-Integer.parseInt(s1[3]);
						}
					}
					else {
						return Integer.parseInt(s1[2])-Integer.parseInt(s2[2]);
					}
				}
				return Integer.parseInt(s2[1])-Integer.parseInt(s1[1]);
			}
		});
		
		for(int i=0; i<num; i++) {
			sb.append(input[i][0]).append("\n");
		}
		System.out.println(sb);
	}

}
