package algorithm_variety;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class algorithm_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = bf.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			q.add(i+1);
		}
		while(!q.isEmpty()) {
			for(int i=0; i<K; i++) {
				if( i == K-1) {
					sb.append(q.poll() + ", ");
				}
				else {
					q.add(q.poll());
				}
			}
		}
		bw.write((sb.substring(0, sb.length()-2) + ">").toString());
		bw.flush();
		bw.close();
		
	}
}
