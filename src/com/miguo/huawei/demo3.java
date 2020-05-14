package com.miguo.huawei;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        do{
            int a = s.nextInt();
            int count = 0;             

            if(a==0)
                return;
            else if(a == 2)
                System.out.println("1");
            else if(a==1)
                System.out.println("0");
            else{
                    count = a/2;
                    System.out.println(count);
                }
                }while(s.hasNext());
        s.close();
	}

}
