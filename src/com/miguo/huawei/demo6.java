package com.miguo.huawei;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num=sc.nextInt();
			List<Integer> list=new LinkedList<Integer>();
			for (int i = 0; i < num; i++) {
				int a=sc.nextInt();
				if(!list.contains(a)) {
					list.add(a);
				}
			}
			Collections.sort(list);
			Iterator<Integer> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
