package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class algorithm_11651 {

	public static void main(String[] args) throws IOException{
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
		//Comparator 사용 compare()의 리턴 값은 음수, 양수, 0이 될 수 있습니다. 음수가 리턴되면 오른쪽 인자가 아래로 내려갑니다.
		Arrays.sort(input, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});
		for(int i=0; i<num; i++) {
			sb.append(input[i][0] + " " + input[i][1]).append("\n");
		}
		System.out.println(sb);

	}

}
