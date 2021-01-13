package algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm_1012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(bf.readLine());
		 String[] input;
		 int[][] arr1 = null;
		 
		 while(num-- > 0) {
			 
			 input = bf.readLine().split(" ");
			 int width = Integer.parseInt(input[0]);
			 int height = Integer.parseInt(input[1]);
			 int tcase = Integer.parseInt(input[2]);
			 
			 arr1 = new int[height][width];
			 
			 for(int i=0; i<tcase; i++) {
				 String[] xy = bf.readLine().split(" ");
				 int x = Integer.parseInt(xy[1]);
				 int y = Integer.parseInt(xy[0]);
				 
				 arr1[x][y] = 1;
				 
			 }
			 
			 int warm = 0;
			 
			 while(true) {
				 boolean find = false;
				 for(int i=0; i<height; i++) {
					 for(int j=0; j< width; j++) {
						 if(arr1[i][j] == 1) {
							 warm++;
							 find = true;
							 arr1[i][j] = 2;
							 break;
						 }
					 }
					 if(find == true) {
						 break;
					 }
				 }
				 if(find == false) {
					 System.out.println(warm); 
					 break;
				 }
				 boolean extend;
				 
				 do {
					 extend = false;
					 for(int i=0; i<height; i++) {
						 for(int j=0; j<width; j++) {
							 if(arr1[i][j] == 2) {
								 if(j > 0 && arr1[i][j-1] == 1) {
									 arr1[i][j-1] = 2;
									 extend = true;
								 }
								 if(j < width -1 && arr1[i][j+1] == 1) {
									 arr1[i][j+1] = 2;
									 extend = true;
								 }
								 if(i>0 && arr1[i-1][j] == 1) {
									 arr1[i-1][j] = 2;
									 extend = true;
								 }
								 if(i < height-1 && arr1[i+1][j] == 1) {
									 arr1[i+1][j] = 2;
									 extend = true;
								 }
							 }
							 
						 }
					 }
					 
				 }
				 while(extend == true);
				 
			 }
			 
			 
		 }
	}

}
