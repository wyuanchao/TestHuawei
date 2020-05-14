package com.miguo.huawei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class demo19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] arr1 = new int[n];
			ArrayList<Integer> list = new ArrayList<>();
			String str = sc.next();
			String[] str1 = new String[n];
			char[] c = str.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if ("1".equals(c[i] + "") || "0".equals(c[i] + "")) {
					list.add(i);
				}
			}
			Iterator<Integer> it = list.iterator();
			for (int i = 0; i < n; i++) {
				arr[i] = it.next();
				arr1[i]=Integer.parseInt(c[arr[i]]+"");
			}
			for (int i = 0; i < n; i++) {
				if (i == n - 1) {
					str1[n - 1] = str.substring(arr[n - 1] + 1);
				} else {
					str1[i] = str.substring(arr[i] + 1, arr[i + 1]);
				}
			}
			for (int i = 0; i < n; i++) {
				if (i == n - 1) {
					if (arr1[i] == 0) {
						String s = daoxuo(str1, n-1);
						System.out.print(s);
					} else {
						System.out.print(str1[i]);
					}
				} if(i<n-1) {
					if (arr1[i] == 0) {
						String s1 = daoxuo(str1, i);
						System.out.print(s1 + " ");
					} else {
						System.out.print(str1[i] + " ");
					}
				}
			}
		}

	public static String daoxuo(String[] str1, int i) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(str1[i]);
		return sb.reverse().toString();
	}

}
