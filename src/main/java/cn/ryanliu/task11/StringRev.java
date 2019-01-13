package cn.ryanliu.task11;

import javax.swing.*;

/*
运用String字符串的方法做一个"正话反说"的游戏
 */
public class StringRev {
    public static void main(String[] args) {
         String str1= JOptionPane.showInputDialog("是那个输入您想说的话:");   //创建被反转的字符串
        System.out.println("原来的话为:"+str1);
        str1.trim();                                                          //去掉字符串的前后空格
        str1.toUpperCase();                                                   //将字符串全部字符转换为大写
        String str2="";                                                       //创建反转后的字符串
        char[] cs=str1.toCharArray();                                         //获取字符串中的每一个字符

        for (int i = cs.length-1; i >=0  ; i--) {           //从最后一个字符开始循环
            str2=str2+cs[i];                                //连接字符
        }
        System.out.println("正话反说为:"+str2);
    }
}
