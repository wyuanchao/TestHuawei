package com.miguo.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo20 {
	public static String daoxuo(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	public static List<String> getSamples(int n, String str) {
		// TODO Auto-generated method stub
		List<String> samples=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			samples.add(str.substring(i*9,i*9+9));
		}
		return samples;
	}
	public static String formatOne(String string) {
		// TODO Auto-generated method stub
		String firstchar=string.substring(0,1);
		if(Integer.parseInt(firstchar)==0) {
			return daoxuo(string.substring(1,9));
		}else {
			return string.substring(1,9);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		List<String> samples=getSamples(n,str);
		String answer="";
		for (String string : samples) {
			answer=answer+formatOne(string);
			answer=answer+" ";
		}
		System.out.println(answer.substring(0, answer.length()-1));
	}
}
