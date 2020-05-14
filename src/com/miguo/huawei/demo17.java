package com.miguo.huawei;

import java.util.Scanner;

public class demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int s=sc.nextInt();
			int[] arr=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			int count=0;
			for (int i = 0; i < n; i++) {
				if(s<arr[i]) {
					break;
				}else {
					count++;
					s=s-arr[i];
				}
			}
			System.out.println(count);
		}
	}

}
