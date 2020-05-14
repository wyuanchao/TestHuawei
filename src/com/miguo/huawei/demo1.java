package com.miguo.huawei;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
				int[] arr=new int[11];
				for (int i = 0; i < arr.length; i++) {
					int a=sc.nextInt();
					if(a==0) {
						break;
					}else {
						arr[i]=a;
					}
				}
				bottle(arr);
			
		}
	}
	public static void bottle(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==0) {
					break;
				}else {
					System.out.println(arr[i]/2);
				}
			}
	
		}
		
	}

