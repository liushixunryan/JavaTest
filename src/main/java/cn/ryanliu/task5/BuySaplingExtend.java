package cn.ryanliu.task5;

import java.util.Scanner;

/*个人不喜欢那个树苗采购
 *特意做了修改!!!
 * 可以在控制台输入购买金额,树苗单价,和数量,然后输出购买方案!
 */
//这个用到了scanner,算是结合使用
public class BuySaplingExtend {
    public static void main(String[] args) {
        int j,m,n;          //定义金桔,猕猴桃,石榴树苗数量
        int jp,mp,np;       //定义金桔,猕猴桃,石榴树苗单价
        int money,num;      //定义购买总金额,购买总数量
        Boolean f=false;    //定义计算成功标识

        Scanner input=new Scanner(System.in);
        System.out.println("请输入金桔树苗的单价:");
        jp=input.nextInt();
        System.out.println("请输入 猕猴桃树苗的单价:");
        mp=input.nextInt();
        System.out.println("请输入石榴树苗的单价:");
        np=input.nextInt();
        System.out.println("请输入购买树苗的总金额:");
        money=input.nextInt();
        System.out.println("请输入购买树苗的总数量:");
        num=input.nextInt();

        System.out.println("金桔猕猴桃石榴");

        //用嵌套的for循环给出采购方案
        for (j=1;j<money/jp;j++){ //金桔树苗至少一颗
            for (m=1;m<money/mp;m++){//猕猴桃至少一颗
                //总采购num棵树苗,石榴就是num-金桔和猕猴桃
                n=num-j-m;
                if (jp*j+mp*m+np*n==money){
                    System.out.println(j+"\t"+m+"\t"+n);
                    f=true;
                }
            }
        }
        if (f==false){
            System.out.println("您输入的数据无法得到合理的方案");
        }
    }
}
