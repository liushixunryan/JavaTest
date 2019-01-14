package cn.ryanliu.task11;

public class StringBufferExam {
    public static void main(String[] args) {
        //追加
        StringBuffer strb1 =new StringBuffer("Java");
        String str1="_script";
        strb1.append(str1);
        System.out.println(strb1);

        //插入
        StringBuffer strb2=new StringBuffer("How you?");
        String str2="are ";
        strb2.insert(4,str2);
        System.out.println(strb2);

        //删除
        StringBuffer strb3=new StringBuffer("Who are them you?");
        strb3.delete(8,13);
        System.out.println(strb3);

        //反转
        StringBuffer strb4=new StringBuffer("I am OK");
        strb4.reverse();
        System.out.println(strb4);

        //转换
        StringBuffer strb5=new StringBuffer("Welcome to java");
        strb5.toString();
        System.out.println(strb5);
    }
}
