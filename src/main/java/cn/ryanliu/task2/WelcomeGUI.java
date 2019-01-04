package cn.ryanliu.task2;
//创建一个入门级的JavaGUI(Java图形用户界面)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WelcomeGUI {
    //创建一个窗体
    static Frame f=new Frame("Welcome GUI");
    static  JLabel label= new JLabel("欢迎进入java的图形用户界面");
    static  JLabel labe2= new JLabel("在这里显示按钮事件描述");
    //创建两个按钮

    static JButton button1= new JButton("点击我");
    static JButton button2= new JButton("退出");

    public static void main(String[] args) {
        f.setSize(200,200);     //设置窗体的宽度和高度
        f.setLayout(new FlowLayout());         //将窗体的布局设置为顺序布局
        //将标签和按钮顺序添加到窗体中
        f.add(label);
        f.add(labe2);
        f.add(button1);
        f.add(button2);
        //通过调用addMouseListener 方法位按钮注册MouseEvent事件
        button1.addMouseListener(new MouseListener() {
            //鼠标按键在组件上单机(按下并释放)时调用此方法
            public void mouseClicked(MouseEvent e) {
                WelcomeGUI.labe2.setText("已点击鼠标");
            }
            //鼠标按键在组件上按下时调用此方法
            public void mousePressed(MouseEvent e) {
                WelcomeGUI.labe2.setText("已按下按钮");
            }
            //鼠标按钮在组件上释放时调用此方法
            public void mouseReleased(MouseEvent e) {

            }
            //鼠标进入到组件上方时调用此方法
            public void mouseEntered(MouseEvent e) {
                WelcomeGUI.labe2.setText("已进入按钮上方");
            }
            //鼠标离开组件时调用此方法
            public void mouseExited(MouseEvent e) {
                WelcomeGUI.labe2.setText("已离开按钮上方");
            }
        });

       button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       f.setVisible(true);//使窗体可见
    }
}
