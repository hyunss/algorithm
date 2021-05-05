package kakao_intern_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class number_1 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        String hand = br.readLine();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        
        System.out.println(solution(numbers, hand));
        
	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left_x = 0, left_y = 3, right_x = 2, right_y = 3;
        int center_x = 0 , center_y = 0;
        int[][] keypade = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        
        for(int i=0; i<numbers.length; i++) {
        	switch(numbers[i]) {
	        	case 1:
	        		answer+="L";
	        		left_x = 0;
	        		left_y = 0;
	        		break;
	        	case 4:
	        		answer+="L";
	        		left_x = 0;
	        		left_y = 1;
	        		break;
	        	case 7:
	        		answer+="L";
	        		left_x = 0;
	        		left_y = 2;
	        		break;
	        	case 3:
	        		answer+="R";
	        		right_x = 2;
	        		right_y = 0;
	        		break;
	        	case 6:
	        		answer+="R";
	        		right_x = 2;
	        		right_y = 1;
	        		break;
	        	case 9:
	        		answer+="R";
	        		right_x = 2;
	        		right_y = 2;
	        		break;
	        	case 2,5,8,0:
	        		int length_l =0, length_r =0;
	        		for(int j=0; j<4; j++) {
	        			for(int k=0; k<3; k++) {
	        				if(numbers[i] == keypade[j][k]) {
	        					center_x = k;
	        					center_y = j;
	        				}
	        			}
	        		}
	        		if(center_x >= left_x) length_l += center_x-left_x;
	        		else length_l += left_x - center_x;
	        		
	        		if(center_y >= left_y) length_l += center_y - left_y;
	        		else length_l += left_y - center_y;
	        		
	        		if(center_x >= right_x) length_r += center_x-right_x;
	        		else length_r += right_x - center_x;
	        		
	        		if(center_y >= right_y) length_r += center_y - right_y;
	        		else length_r += right_y - center_y;
	        		
	        		
	        		if(length_r > length_l) {
	        			answer += "L";
	        			left_x = center_x;
	        			left_y = center_y;
	        		}
	        		else if(length_r < length_l){
	        			answer+="R";
	        			right_x = center_x;
	        			right_y = center_y;
	        		}
	        		else {
	        			if(hand.equals("right")){
	        				answer+="R";
		        			right_x = center_x;
		        			right_y = center_y;
	        			}
	        			else {
	        				answer += "L";
		        			left_x = center_x;
		        			left_y = center_y;
	        			}
	        		}
	        		break;
        	}
        }
        return answer;
    }

}
