package cn.ryanliu.task12;

/*
运用try catch finally 做一个除法计算器练习处理异常
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateException {
    public static void main(String[] args) {
        int result[]={0,1,2};
        int operand1=0;
        int operand2=0;
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("请输入除数:");
            operand1=in.nextInt();
            System.out.println("请输入被除数:");
            operand2=in.nextInt();
            result[2]=operand2/operand1;
            System.out.println("计算结果:"+result[2]);
        }catch (InputMismatchException ie){
            System.out.println("异常:输入不为数字");
        }
        catch (ArithmeticException ae){
            System.out.println("异常:除数不能为0");
        }
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("异常:数组索引越界");
        }catch (Exception e){
            System.out.println("其他异常:"+e.getMessage());
        }
        finally {
            System.out.println("欢迎使用计算器");
        }
    }
}
