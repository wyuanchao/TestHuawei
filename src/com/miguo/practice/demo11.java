package com.miguo.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr=new int[n];
			LinkedList<Integer> list1 = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				list1.add(i, arr[i]);
				// System.out.println(list);
				Collections.reverse(list1);
				// System.out.println(list);
			}
			for (int i = 0; i < list1.size(); i++) {
				if (i == list1.size()) {
					System.out.print(list1.get(i));
				} else {
					System.out.print(list1.get(i) + " ");
				}
			}
			System.out.println();
		}

	}

	public static void demo1() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				str.append(arr[i]);
			}
			System.out.println(str);
			for (int i = 0; i < n; i++) {
				str.deleteCharAt(n - 1);
				str.insert(n - 1, arr[i]);
				str.reverse();
				System.out.println(str);
			}
			String s = str.toString();
			char[] c = s.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (i == c.length - 1) {
					System.out.print(c[i]);
					System.out.println();
				} else {
					System.out.print(c[i] + " ");
				}
			}
		}
	}

}
