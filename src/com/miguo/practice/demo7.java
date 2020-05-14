package com.miguo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
 
public class demo7
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext())
        {
            int numPeople=scanner.nextInt();
            int option=scanner.nextInt();
             
            List<Student> stuList=new ArrayList<Student>();
            for(int i=0;i<numPeople;i++)
            {
                stuList.add(new Student(scanner.next(), scanner.nextInt()));
            }
             
            //����
            if(option==0)
            {
                Collections.sort(stuList, new Comparator<Student>()
                {
                    public int compare(Student o1,Student o2)
                    {
                        return o2.score-o1.score;
                    }
                });
            }
            else if(option==1)//����
            {
                Collections.sort(stuList, new Comparator<Student>()
                {
                    public int compare(Student o1,Student o2)
                    {
                        return o1.score-o2.score;
                    }
                });
            }
            for(int i=0;i<stuList.size();i++)
            {
                System.out.println(stuList.get(i).name+" "+stuList.get(i).score);
            }
        }
    }
}
 
class Student
{
    public String name;
    public int score;
    public Student(String name,int score)
    {
        this.name=name;
        this.score=score;
    }
}
