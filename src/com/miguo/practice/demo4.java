package com.miguo.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num=1;
			String str=sc.nextLine();
			String regex="1?(01)*";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str);
			String regex1="0?(10)*";
			Pattern p1=Pattern.compile(regex1);
			Matcher m1=p1.matcher(str);
			while(m.find()) {
				int n=m.group().length();
				if(n>=num) {
					num=n;
				}
			}
			while(m1.find()) {
				int n1=m1.group().length();
				if(n1>=num) {
					num=n1;
				}
			}
			System.out.println(num);
		}
	}

}
