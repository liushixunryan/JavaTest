package cn.ryanliu.task10;

import javax.swing.*;

public class ArrayBank2 {
    public static void main(String[] args) {
        double[] rate=new double[5];            //定义利率得一维数组
        int[][] bill=new int[11][5];            //定义存款本利的二维数组
        int capital =10000;                     //定义本金为10000

        for (int i = 0; i <rate.length ; i++) {
            rate[i]=Double.parseDouble(JOptionPane.showInputDialog("可输入5种利率,请输入第"+(i+1)+"种利率:"));
        }

        for (int i = 0; i <bill[0].length ; i++) { //初始化第一年本金
            bill[0][i] =capital;
        }
        for (int i = 1; i <bill.length ; i++) { //定义存款本利打印的最大年数
            for (int j = 0; j <rate.length ; j++) { //循环的到利率
                double inc=bill[i-1][j]*rate[j];    //计算当年所得利息
                bill[i][j]= (int) (bill[i-1][j]+inc);   //计算当年的本利和
            }
        }
        System.out.println("N年后"+"\t");
        for (int i = 0; i <rate.length ; i++) {
            System.out.print(rate[i]+"%\t");
        }
        System.out.println();
        for (int i = 0; i <bill.length ; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j <bill[i].length ; j++) {
                System.out.print(bill[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
