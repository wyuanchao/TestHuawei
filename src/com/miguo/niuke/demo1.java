package com.miguo.niuke;

import java.util.Arrays;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			//System.out.println(Arrays.toString(arr));
			int result=0;
			if(n%2==1) {
				int m=n/2;
				for (int i = m+2; i < n; i++) {
					result=result+arr[i]*2;
				}
				result=result+arr[m]+arr[m+1];
				for (int i = 0; i <=m-1; i++) {
					result=result-arr[i]*2;	
				}
			}else {
				int m=n/2;
				for (int i = m+1; i < n; i++) {
					result=result+arr[i]*2;
				}
				result=result+arr[m]-arr[m-1];
				for (int i = 0; i < m-1; i++) {
					result=result-arr[i]*2;
				}
			}
			System.out.println(result);
		}
	}

}
