package naver_number_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		solution s = new solution();

		String answer = s.solution("aabcb","ab");
		
		
		System.out.print(answer);
	}

	
}

class solution{
	public String solution(String m, String k) {
	    String answer = "";
		
	    String[] input = m.split("");
	    String[] key = k.split("");
	    
	    ArrayList<String> message = new ArrayList<>();
	    int a=0;
	    int b=0;
	    
    	while(b < input.length) {
    		if(a<key.length) {
    			if(!input[b].equals(key[a])) {
    				message.add(input[b]);
    			}
    			else {
    				a++;
    			}
    			b++;
    		}
    		else {
    			message.add(input[b]); 
    			b++;
    			
    		}
    	}
	    
	    for(int i=0; i< message.size(); i++) {
	    	answer += message.get(i);
	    }
	    return answer;
	}
}
