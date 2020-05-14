package com.miguo.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str=sc.nextLine();
			char[] ch=str.toCharArray();
			ArrayList<Character> list=new ArrayList<>();
			for (int i = 0; i < ch.length; i++) {
				if(!list.contains(ch[i])) {
					list.add(ch[i]);
				}
			}
			for (Character c : list) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
