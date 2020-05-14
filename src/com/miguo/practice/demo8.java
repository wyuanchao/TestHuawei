package com.miguo.practice;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str=sc.next();
			int k=sc.nextInt();
			//System.out.println(str);
			//System.out.println(k);
			char[] c=str.toCharArray();
			int[] arr=new int[26];
			for (int i = 0; i < str.length(); i++) {
				arr[c[i]-'a']++;
			}
			for (int i = 0; i < k; i++) {
				int max=0;
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]>max) {
						max=arr[j];
					}
				}
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]==max) {
						arr[j]--;
						break;
					}
				}
			}
			int result=0;
			for (int i = 0; i < arr.length; i++) {
				result=result+arr[i]*arr[i];
			}
			System.out.println(result);
		}
	}

}
