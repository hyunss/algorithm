package algorithm_variety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class algorithm_2751 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> input =  new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			input.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(input);
		
		for(int value : input) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
		//Quicksort(0,num-1);
		
		/*buble정렬*/
//		for(int i=0; i<num; i++) {
//			int temp = 0;
//			for(int j =0; j<i; j++) {
//				if(input[j]>input[i]) {
//					temp = input[j];
//					input[j] = input[i];
//					input[i] = temp;
//				}
//			}
//		}
		
	}
	/* 퀵정렬 
	public static void Quicksort(int left, int right) {
		int pivot, p;
		int i, j, temp;
		if(left<right) {
			p = (int)((Math.random()*10 % (right-left+1)) + left);
			pivot = input[p];
			
			input[p] = input[left];
			input[left] = pivot;
			i = left +1;
			j = right;
			
			while(i<=j) {
				while(i <= right && input[i] <= pivot){
	                i++;
	            }
	            while(j > left &&input[j] >= pivot){
	                j--;
	            }
	            if(i>j){
	                temp = input[j]; 
	                input[j] = input[left];
	                input[left] = temp;

	            }
	            else{
	                temp = input[i];
	                input[i] = input[j]; 
	                input[j] = temp;
	            }
			}
			Quicksort(left, j-1);
			Quicksort(j, right);
		}
	} */

}
