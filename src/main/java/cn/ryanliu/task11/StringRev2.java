package cn.ryanliu.task11;

import javax.swing.*;

/*
运用StringBuffer类进行字符串处理
 */
public class StringRev2 {
    public static void main(String[] args) {
        StringBuffer strb1=new StringBuffer(JOptionPane.showInputDialog("请输入你想说的话:"));//创建被反转的字符串
        System.out.println("原来的话为:"+strb1);
        StringBuffer strb2= strb1.reverse();        //调用反转方法
        System.out.println("正话反说为:"+strb2);
    }
}
