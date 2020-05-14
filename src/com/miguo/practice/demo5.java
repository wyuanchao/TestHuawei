package com.miguo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int h=sc.nextInt();
			int[] arr=new int[h];
			for (int i = 0; i < h; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int w=sc.nextInt();
			int[] max={0,0};
			//int min=Math.min(h, w);
			int[] arr1=new int[w];
			for (int i = 0; i < w; i++) {
				arr1[i]=sc.nextInt();
			}
			Arrays.sort(arr1);
			//System.out.println(Arrays.toString(arr));
			//System.out.println(Arrays.toString(arr1));
			for (int i = 0; i < w; i++) {
				compare(arr,arr1,i,max);
			}
			System.out.println(max[0]);
		}
	}

	public static int[] compare(int[] arr,int[] arr1, int i,int[] max) {
		// TODO Auto-generated method stub
		if(max[1]==arr.length) {
			return max;
		}
		for (int j = max[1]; j < arr.length; j++) {
			if(arr1[i]>=arr[j]) {
				max[0]++;
				max[1]=j+1;
				return max;
			}
		}
		return max;
	}

}
