package com.miguo.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < n; i++) {
				arr1[i]=i+1;
			}
			//System.out.println(Arrays.toString(arr1));
			//System.out.println(Arrays.toString(arr));
			for (int i = 0; i < n; i++) {
				if(arr[i]-arr1[i]==0) {
					if(i==0) {
						System.out.println(0);
					}
					else{System.out.println(arr1[i-1]);
					}
					break;
				}
			}
		}
	}

}
