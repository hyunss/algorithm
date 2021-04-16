package algorithm_variety;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class algorithm_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> res = new LinkedList<>();
		String input = bf.readLine();
		int num = Integer.parseInt(bf.readLine());
			
		for(int i=0; i< input.length(); i++) {
			res.add(input.charAt(i));
		}
		ListIterator<Character> iter = res.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i=0; i<num; i++) {
			String command = bf.readLine();
			char c = command.charAt(0);
			if(c == 'L') {
				if(iter.hasPrevious()) {
					iter.previous();
				}
			}
			else if(c=='D') {
				if(iter.hasNext()) {
					iter.next();
				}
			}
			else if(c== 'B') {
				if(iter.hasPrevious()) {	
					iter.previous();
					iter.remove();
				}
			}
			else {
				iter.add(command.charAt(2));
			}
		}
	
		for(Character chr : res) {
			bw.write(chr);
		}
		
		bw.flush();
		bw.close(); 
		
	}
}
