package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class algorithm_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		ArrayList<Integer> queue =  new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String input = st.nextToken();
			
			if(input.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			else if(input.equals("front")) {
				if(queue.size() == 0 ){
					System.out.println(-1);
				}
				else System.out.println(queue.get(0));
			}
			else if(input.equals("size")) {
				System.out.println(queue.size());
			}
			else if(input.equals("empty")) {
				if(queue.size() == 0) {
					System.out.println(1);
				}
				else System.out.println(0);
			}
			else if(input.equals("pop")) {
				if(queue.size() == 0) {
					System.out.println(-1);
				}
				else {
					int popNum = queue.get(0);
					queue.remove(0);
					System.out.println(popNum);
				}
			}
			else {
				if(queue.size() == 0){
					System.out.println(-1);
				}
				else System.out.println(queue.get(queue.size()-1));
			}
		}
	}
}
