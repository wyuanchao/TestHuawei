package com.miguo.huawei;

import java.util.Scanner;

public class package01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num=Integer.parseInt(sc.nextLine());
			int[][] arr=new int[num][];
			for (int i = 0; i < num; i++) {
				char[] cr=sc.nextLine().toCharArray();
				int[] row=new int[cr.length];
				for (int j = 0; i < cr.length; i++) {	
					row[j]=Integer.parseInt(cr[j]+"");
				}
				arr[i]=row;
			}
			
		}
	}
	public static int result(int[][] arr,int m,int n) {
		int result=0;
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				
			}
		}
		return 0;
	}

}
