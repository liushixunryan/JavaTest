package cn.ryanliu.task3;
//计算三角形面积周长
public class TriangleArea {
    public static void main(String[] args) {
        int a,b,c;
        double area,p;
        a=Integer.parseInt("2");//这里改边
        b=Integer.parseInt("2");//这里改边
        c=Integer.parseInt("3");//这里改边
        if (a+b>c&&a+c>b&&c+b>a){
            p=(a+b+c)/2.0;
            area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("三角形的周长为:"+2*p);
            System.out.println("三角形的面积为:"+area);
        }
        else {
            System.out.println("您输入的三条边不能构成三角形");
        }
    }
}
