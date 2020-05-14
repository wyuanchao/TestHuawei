package com.miguo.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class demo11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			printCharCollection(str);
		}
		scan.close();
	}

	public static void printCharCollection(String str) {
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<Character>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (set.add(ch[i])) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
