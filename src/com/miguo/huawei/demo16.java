package com.miguo.huawei;

import java.util.Scanner;

public class demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			int result=0;
			int a=0;
			int b=n-1;
			int c=1;
			for (int i = 0; i < n; i++) {
				if(arr[a]<=arr[b]) {
					result=result+arr[a]*c;
					a++;
					c++;
				}else {
					result=result+arr[b]*c;
					b--;
					c++;
				}
			}
			System.out.println(result);
		}
	}

}
