package cn.ryanliu.task6;

import java.util.Scanner;

/*
做一个交换数据得方法
 */
public class Swap {
    public static void swap(Integer a,Integer b) {
        Integer temp=a;             //形参为a,b,交换a与b得数据
        a=b;
        b=temp;
    }
    public static void main(String[] args) {  //程序入口方法
        Integer a,b;
        int ia,ib;
        Scanner input=new Scanner(System.in); //从键盘输入数据
        System.out.println("请输入第一个整数 a:");
        ia=input.nextInt();
        System.out.println("请输入第二个整数 b:");
        ib=input.nextInt();

        a=new Integer(ia);
        b=new Integer(ib);

        System.out.println("交换前:a="+a+"b="+b);
        swap(a,b);
        System.out.println("交换后:a="+a+"b="+b);

    }
}
