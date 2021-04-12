package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class algorithm_10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		ArrayList<Integer> stack =  new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String input = st.nextToken();
			
			if(input.equals("push")) {
				stack.add(Integer.parseInt(st.nextToken()));
			}
			else if(input.equals("top")) {
				if(stack.size() == 0 ){
					System.out.println(-1);
				}
				else System.out.println(stack.get(stack.size()-1));
			}
			else if(input.equals("size")) {
				System.out.println(stack.size());
			}
			else if(input.equals("empty")) {
				if(stack.size() == 0) {
					System.out.println(1);
				}
				else System.out.println(0);
			}
			else if(input.equals("pop")) {
				if(stack.size() == 0) {
					System.out.println(-1);
				}
				else {
					int popNum = stack.get(stack.size()-1);
					stack.remove(stack.size()-1);
					System.out.println(popNum);
				}
			}
		}
	}
}
