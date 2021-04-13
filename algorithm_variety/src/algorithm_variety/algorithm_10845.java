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
		ArrayList<Integer> deque =  new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String input = st.nextToken();
			
			if(input.equals("push_front")) {
				deque.add(0, Integer.parseInt(st.nextToken()));
			}
			else if(input.equals("push_back")) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			else if(input.equals("size")) {
				System.out.println(deque.size());
			}
			else if(input.equals("empty")) {
				if(deque.size() == 0) {
					System.out.println(1);
				}
				else System.out.println(0);
			}
			else if(input.equals("pop_front")) {
				if(deque.size() == 0 ){
					System.out.println(-1);
				}
				else {
					int popNum = deque.get(0);
					deque.remove(0);
					System.out.println(popNum);
				}
			}
			else if(input.equals("pop_back")) {
				if(deque.size() == 0 ){
					System.out.println(-1);
				}
				else {
					int popNum = deque.get(deque.size()-1);
					deque.remove(deque.size()-1);
					System.out.println(popNum);
				}
			}
			else if(input.equals("front")) {
				if(deque.size() == 0 ){
					System.out.println(-1);
				}
				else {
					System.out.println(deque.get(0));
				}
			}
			else if(input.equals("back")) {
				if(deque.size() == 0 ){
					System.out.println(-1);
				}
				else {
					System.out.println(deque.get(deque.size()-1));
				}
			}
		}
	}
}
