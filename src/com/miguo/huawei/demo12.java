package com.miguo.huawei;

import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int[] arr=new int[N];
			for (int i = 0; i < N; i++) {
				arr[i]=sc.nextInt();
				//System.out.println(11);
			}
			//System.out.println(1111111);
			Scanner sc1 = new Scanner(System.in);
			for (int i = 0; i < M; i++) {
				String str=sc.next();
				System.out.println(str);
				String str1=sc.next();
				System.out.println(str1);
				String str2=sc.next();
				System.out.println(str2);
				int a=Integer.parseInt(str1);
				int b=Integer.parseInt(str2);
				if(str.equals('Q'+"")) {
					getMax(arr,a,b);
				}
				if(str.equals('U'+"")) {
					getChange(arr,a,b);
				}
			}
			sc1.close();
		}
	}

	public static void getChange(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		arr[a-1]=b;
	//System.out.println();
	}

	public static void getMax(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		int max=0;
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		for (int i = a-1; i <=b-1; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
