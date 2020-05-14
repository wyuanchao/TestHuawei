package com.miguo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class demo6 {

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
			int a=arr[1]-arr[0];
			String str="Possible";
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i+1]-arr[i]!=a) {
					str="Impossible";
				}
			}
			System.out.println(str);
		}
	}

}
