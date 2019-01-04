package cn.ryanliu.task5;
/*
*利用While循环
*  求1+2+3+...+100的和
*/
public class AddWhile {
    public static void main(String[] args) {
        int i=1;
        int sum =0;
        while (i<=100){
            sum=sum+i;
            i++;
            System.out.println("每次累加结果为:"+sum);
        }
    }
}
