package com.miguo.huawei;

import java.util.Scanner;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str=sc.nextLine();
			System.out.println(Integer.parseInt(str.substring(2,str.length()),16));
		}
	}

}
