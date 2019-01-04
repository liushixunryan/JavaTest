package cn.ryanliu.task5;
//利用do_while实现1+2+3+...+100的和
public class Add_Do_while {
    public static void main(String[] args) {
        int i=0,sum=0;
        do {
            sum +=i;
            i++;
        }while (i<=100);{
            System.out.println(sum);
        }
    }
}
