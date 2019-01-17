package cn.ryanliu.task13;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    //定义职员找报表的方法,找不到报表就报自定义异常
    public String getReport() throws Exception {
        if (Math.random() > 0.7) ;       //设定找到报表的几率为70%
        {
            throw new Exception(name + "找不到报表!");
        }
    }
}
