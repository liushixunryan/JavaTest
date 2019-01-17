package cn.ryanliu.task13;
/*
定义职员类
 */
public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    //定义职员找报表的方法,找不到报表就报自定义异常
    public String getReport(){
        if (Math.random()>0.7)          //设定找到报表的概率是70%
        {
            try {
                throw new Exception(name+",找不到报表");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return name+",找到报表了,快向领导报告  ";
    }
}
