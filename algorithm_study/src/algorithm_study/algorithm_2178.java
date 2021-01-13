package algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue; 

public class algorithm_2178 {
	static int N, M;
	static int[] dx = {0, 1, 0, -1}; //상우하좌
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] check;
	static int arr[][];
	
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int [N][M];
		check = new boolean [N][M];

		for(int i=0; i<N; i++) {
			String input = bf.readLine();
			String temp[] = new String[M];
			temp = input.split("");
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}
		bfs();
		System.out.println(arr[N-1][M-1]);
		
	}
	public static void bfs() {
		Queue<Integer> qx = new LinkedList<Integer>();		
		Queue<Integer> qy = new LinkedList<Integer>();	
		
		qx.add(0);
		qy.add(0);
		check[0][0] = true;
		
		while(!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			
			for(int i=0;i<4;i++) {
				int temp_x = x + dx[i];
				int temp_y = y + dy[i];
				
				if(temp_x >=0 && temp_y >= 0 && temp_x < N && temp_y < M) {
					if(arr[temp_x][temp_y] == 1 && check[temp_x][temp_y] == false) {
						qx.add(temp_x);
						qy.add(temp_y);
						check[temp_x][temp_y] = true;
						
						arr[temp_x][temp_y] = arr[x][y] + 1;
					}
				}
			}
			
		}
		
	}

}
