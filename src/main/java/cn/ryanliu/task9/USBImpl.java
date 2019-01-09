package cn.ryanliu.task9;
/*
实现类
 */

public class USBImpl implements USB {
    public void start() {
        System.out.println("移动硬盘插入,开始使用");
    }

    public void stop() {
        System.out.println("移动硬盘退出工作");
    }

    public static void main(String[] args) {
        USB usb=new USBImpl();
        usb.start();
        usb.stop();
    }
}
