package com.miguo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			int[] arr1=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
				arr1[i]=arr[i];
			}
			int num=0;
			Arrays.sort(arr);
			for (int i = 0; i < n; i++) {
				if(arr1[i]!=arr[i]) {
					num++;
				}
			}
			System.out.println(num);
		}
	}

}
