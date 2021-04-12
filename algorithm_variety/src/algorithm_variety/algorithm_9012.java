package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class algorithm_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		for(int i=0; i<num; i++) {
			String input = bf.readLine();
		
			System.out.println(solve(input));
		}	
	}
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(c);
			}
			else if(stack.empty()) {
				return "NO";
			}
			else stack.pop();
			
		}
		if(stack.empty()) {
			return "YES";
		}
		else return "NO";
	}
}
