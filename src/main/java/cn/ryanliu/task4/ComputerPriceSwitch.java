package cn.ryanliu.task4;

import javax.swing.*;

/*
 * 编制某运输公司计算运费的程序,请用if-else条件语句实现
 * s是距离;单位:km;p是基本运费,单位:yuan/(t*km);w是重量,单位:t;d是优惠金额的百分比;f是总运费.
 * 该运输公司的收费标准为:s<250km.没有优惠250km<s<500km,优惠2%;500km<=s<1000km,优惠5%;1000km<=s<2000km,优惠8%
 * 2000km<=s<3000km,优惠10%;30000<=s,优惠15%;
 * */
//通过switch条件语句实现计算运费
public class ComputerPriceSwitch {
    public static void main(String[] args) {
        int c,s=0;
        double p=0,w=0,d,f;
        p=Double.parseDouble(JOptionPane.showInputDialog("请输入运输公司的运输单价",new Double(p)));
        w=Double.parseDouble(JOptionPane.showInputDialog("请输入要运输货物的重量",new Double(w)));
        s=Integer.parseInt(JOptionPane.showInputDialog("请输入运输的距离",new Integer(s)));

        if (s>3000){
            c=12;
        }else {
            c=s/250;
        }
        switch (c){
            case 0:
                d=0;
                break;
            case 1:
                d=0.02;
                break;
            case 2:
            case 3:
                d=0.05;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                d=0.08;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                d=0.1;
                break;
            case 12:
                d=0.15;
                break;
            default:
                d=0.15;break;
        }
        f=p*w*s*(1-d);
        System.out.println("运输公司的运输单价为:"+p);
        System.out.println("该次运输的货物重量为:"+w);
        System.out.println("该次运输的运输距离为:"+s);
        System.out.println("该次运输的总运费为:"+f);
    }
}
