package com.miguo.practice;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int t=sc.nextInt();
			int a=sc.nextInt();
			int b=n-t;
			int c=n-a;
			int result=Math.min(t, a)+Math.min(b, c);
			System.out.println(result);
		}
	}

}
