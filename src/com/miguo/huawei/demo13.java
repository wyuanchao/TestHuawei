package com.miguo.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);                        //���ô��ѧ����Ŀ�Ͳ�����Ŀ������

        do{
        //System.out.println("������ѧ����Ŀ�Ͳ�����Ŀ:");
        int[] data = new int[2];

            data[0] = sc.nextInt();
            data[1] = sc.nextInt();
        //System.out.println("������ѧ���ɼ�:");   
        ArrayList<Integer> array = new ArrayList<Integer>();        //���ɼ����붯̬������
        for(int i=0;i < data[0];i++){
            array.add(sc.nextInt());
        }

        int time=0;
        char a;
        int b,c;
        while(time < data[1]){
        //System.out.println("�������������:"); 
            a = sc.next().charAt(0);                                //���һ���ַ�
            b = sc.nextInt();
            c = sc.nextInt();

            if(a=='Q')
            {
                int start,end;
                    if(b<c){
                        start = b-1;
                        end = c-1;
                    }else{
                        start = c-1;
                        end = b-1;
                    }

                    int max = array.get(start);             //��õ�һ����ѯ��ѧ���ɼ�
                    for(int index=start+1;index<=end;index++){
                            if(max<array.get(index)){
                                max = array.get(index);
                            }
                    }
                    System.out.println(max);
                    max = 0;
            }

            if(a=='U'){
                int index1 = b-1;
                int newValue = c;
                array.set(index1, newValue);
            }
            time++;
            }
        }   while(sc.hasNext());
        sc.close();
    }
}

