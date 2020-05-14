package com.miguo.huawei;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if(num==0){break;}
			System.out.println(getWater(num));
		}
		sc.close();
	}
	public static int getWater(int num){
		int count = 0;
		while(true){
			if(num <= 1) return count;
			if(num ==2) return count+1;
			num = num - 2 ;
			count = count+1;
		}
	}
	}

