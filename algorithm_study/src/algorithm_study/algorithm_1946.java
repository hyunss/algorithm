package algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_1946 {

	public static void main(String[] args) throws IOException{
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(bf.readLine());
		 int tcase =0;
		 String[] input;
		 int[] arr1 = null;
		 
		 for(int i=0; i<num; i++) {
			 tcase = Integer.parseInt(bf.readLine());
			 arr1 = new int[tcase+1];
			 int count = tcase;
			 int max;
			 for(int j=0; j< tcase; j++) {
				 input = bf.readLine().split(" ");
				 
				 arr1[Integer.parseInt(input[0])] = Integer.parseInt(input[1]);
				
			 }
			 max = arr1[1];
			 
			 for(int j=2; j<=tcase; j++) {
				 if(arr1[j] > max) {
					count--;
				 }
				 if(arr1[j] < max) {
					 max = arr1[j];
				 }
			 }
			 
			 System.out.println(count);
		 }
	}

}
