package com.miguo.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			ArrayList<Character> list = new ArrayList<>();
			for (int i = 0; i < str.length(); i++) {
				char a = ch[i];
					list.add(a);
			
			}
			getSingle(list);
			System.out.println();
		}
	}

	public static void getSingle(ArrayList<Character> list) {
		// TODO Auto-generated method stub
		ArrayList<Character> newlist = new ArrayList<>();
		//String str3="";
		for (Character c : list) {
			if (!newlist.contains(c)) {
				newlist.add(c);
			}
		}
		for (Character cr : newlist) {
			
			//str3=str3+cr;
			System.out.print(cr);
		}
		//System.out.println(str3);
	}

}
