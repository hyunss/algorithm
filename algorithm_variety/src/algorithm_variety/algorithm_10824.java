package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_10824 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		
		String[] c = input.split(" ");
		long a = Long.parseLong(c[0] + c[1]);
		long b = Long.parseLong(c[2] + c[3]);
		
		System.out.println(a+b);
	}
}
