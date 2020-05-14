package com.miguo.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num > 1000) {
				num = 999;
			}
			System.out.println(getLuckly(num));
		}
	}

	public static int getLuckly(int num) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(i);
		}
		int count=1;
		for(int i=0;list.size()!=1;i++) {
			if(i==list.size()) {
				i=0;
			}
			if(count%3==0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}

}
