package com.miguo.huawei;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a != 0) {
				list.add(a);
			}else {
				bottle(list);
				list.clear();
			}
		}

	}

	public static void bottle(List<Integer> list) {
		// TODO Auto-generated method stub
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			int b=it.next();
			System.out.println(b/2);
		}
	}

}
