package com.miguo.huawei;

import java.util.Scanner;

public class demo5 {
		static int num2=0;//�ȵ���������
		 
		public static void main(String[] args){
			int[] num1 = new int[10];//��ƿ����
			int count = 0, temp;
			Scanner sc = new Scanner(System.in);
			while(count<10){
				temp = sc.nextInt();
				if(temp==0)	break;
				num1[count] = temp;
				count++;
			}
	 
			for(int i=0;i<count;i++){
				num2 = 0;
				fun(num1[i]);
				System.out.println(num2);
			}
		}
	 
		public static void fun(int n){
			if(n==1){
				return;
			}if(n==2){
				num2++;
				return;
			}else if(n>=3){
				num2 = num2+n/3;
				fun(n/3+n%3);
			}
		}

	}

