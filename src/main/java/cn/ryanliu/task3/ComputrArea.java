package cn.ryanliu.task3;

//计算圆的面积和周长
public class ComputrArea {
    public static void main(String[] args) {
        final double PI=3.1415926;//定义常量PI
        double r,perimeter,area;
        int int_p;
        r=Double.parseDouble(args[0]);//字符串与数值类型数值转换  //这里改数
        System.out.println( "r="+r);
        perimeter=2*PI*r;
        int_p = (int) perimeter;//强制类型转换
        area=PI*r*r;
        System.out.println("圆的周长(只保留整数部分)为:"+int_p);
        System.out.println("圆的面积为:"+area);
    }
}
