package cn.ryanliu.task13;
/*
测试类

此题为:某公司需要查找某份报表,找到报表的概率为70%,
找报表的过程涉及职位有职员,经理,财务总监,首席执行官.
当找不到报表时,产生异常.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //创建职工对象 a,b,c,d
        Employee a=new Employee("张三");
        Employee b=new Employee("李四");
        Employee c=new Employee("王五");
        Employee d=new Employee("赵六");

        Employee[] e=new Employee[]{a,b,c,d};       //创建职工数组
        Manager[] m=new Manager[]{new Manager(e)};  //创建经理数组
        CFO cfo=new CFO(m);                         //创建CFO对象
        CEO ceo=new CEO(cfo);                       //创建CEO对象

        System.out.println(ceo.getReport());        //CEO对象调用找报表的方法,输出
    }
}
