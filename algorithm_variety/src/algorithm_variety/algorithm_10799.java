package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class algorithm_10799 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String input = bf.readLine();
		
			System.out.println(solve(input));
	}
	
	public static int solve(String s) {
		Stack<Character> stack = new Stack<>();
		
		int res = 0; 
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}
			else {
				stack.pop();
				if(s.charAt(i-1) == '(') {
					res += stack.size();
				}
				else res++;
			}
		}
		
		
		return res;
	}
}
