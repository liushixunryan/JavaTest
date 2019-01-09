package cn.ryanliu.task10;

import javax.swing.*;

/*
银行存款本利账单
   本程序计算一年后不同利率的存款本利之和
 */
public class ArrayBank {
    public static void main(String[] args) {
        double[] rate=new double[5];        //定义表示利率的一维数组
        int[] bill=new int[5];              //定义表示存款本利和的一维数组
        int capital=10000;                  //定义本金为10000

        for (int i = 0; i <rate.length ; i++) {
            rate[i]=Double.parseDouble(JOptionPane.showInputDialog("可输入5种利率,请输入第"+(i+1)+"种利率:"));
        }
        for (int i = 0; i <bill.length ; i++) {     //计算一年后各利率下的本利和
            double inc=capital*rate[i];             //计算一年所得利息
            bill[i]= (int) (capital+inc);
        }
        System.out.print("一年后"+"\t");
        for (int i = 0; i <rate.length ; i++) {
            System.out.print(rate[i]+"%");
        }
        System.out.println();
        System.out.print("\t");
        for (int i = 0; i <bill.length ; i++) {
            System.out.print(bill[i]+"\t");
        }
    }
}
