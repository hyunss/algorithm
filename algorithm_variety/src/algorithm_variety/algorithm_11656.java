package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class algorithm_11656 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split("");
		ArrayList<String> array = new ArrayList<>();
		
		for(int i=0; i<input.length; i++) {
			String sb = "";
			for(int j=i; j<input.length; j++) {
				sb += input[j];
			}
			array.add(sb);
		}
		
		Collections.sort(array);
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
