package cn.ryanliu.task4;

import javax.swing.*;
/*
* 编制某运输公司计算运费的程序,请用if-else条件语句实现
* s是距离;单位:km;p是基本运费,单位:yuan/(t*km);w是重量,单位:t;d是优惠金额的百分比;f是总运费.
* 该运输公司的收费标准为:s<250km.没有优惠250km<s<500km,优惠2%;500km<=s<1000km,优惠5%;1000km<=s<2000km,优惠8%
* 2000km<=s<3000km,优惠10%;30000<=s,优惠15%;
* */
//通过if-else条件语句实现计算运费
public class ComputerPriceIf {
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
        }if (c<1){
            d=0;
        }else {
            if (c<2){
                d=0.02;
            }else {
                if (c<4){
                    d=0.05;
                }
                else {
                    if (c<8){
                        d=0.08;
                    }else {
                        if (c<12){
                            d=0.1;
                        }
                        else {
                            d=0.15;
                        }
                    }
                }
            }
        }
        f=p*w*s*(1-d);
        System.out.println("运输公司的运输单价为:"+p);
        System.out.println("该次运输的货物重量为:"+w);
        System.out.println("该次运输的运输距离为:"+s);
        System.out.println("该次运输的总运费为:"+f);
    }
}
