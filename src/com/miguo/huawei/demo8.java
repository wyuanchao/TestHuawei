package com.miguo.huawei;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num=sc.nextInt();
			if(num>1000) {
				num=999;
			}
			System.out.println(getLuckly(num));
		}
	}

	public static int getLuckly(int num) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		for (int i = 0; i < num; i++) {
			list.add(i);
		}
		int count=1;
		for (int i = 0; list.size()!=1; i++) {
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
