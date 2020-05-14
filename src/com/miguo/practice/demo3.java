package com.miguo.practice;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			int n = str.length();
			int[] arr = new int[n];
			char[] c = str.toCharArray();
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(c[i] + "");
			}
			int num = 1;
			int result = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n - 1; j++) {
					if (arr[j] != arr[j + 1]) {
						num++;
						// System.out.println(11111);
						// System.out.println(num);
					}
					if (num >= result) {
						result = num;
						// System.out.println(result);
					}
					if (arr[j] == arr[j + 1]) {
						break;
					}
				}
				num = 1;
			}
			System.out.println(result);
		}
	}

}
