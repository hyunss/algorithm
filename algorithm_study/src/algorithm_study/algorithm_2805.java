package algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class algorithm_2805 {
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		long sum =0;
		int mid=0, start =0, end =0;
		String input = bf.readLine();
		StringTokenizer s = new StringTokenizer(input, " ");

		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s.nextToken());			
		}
		Arrays.sort(arr);
		end = arr[n-1];
		
		while(start <= end) {
			mid = (start + end) / 2;
			sum =0;
			for(int i=0; i< n; i++) {
				if(arr[i] > mid) {
					sum += (arr[i] - mid);
				}
			}
			if(sum < m) end = mid-1;
			else start = mid+1;
		}
		System.out.println(end);
	}
}
