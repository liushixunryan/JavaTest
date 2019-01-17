package cn.ryanliu.task13;
/*
定义经理类
 */
public class Manager {
    Employee[] es;          //定义职员数组

    //将职员数组传入构造方法
    public Manager (Employee[] es){
        this.es=es;
    }

    //定义经理找到报表的方法
    public String getReport() throws Exception{
        StringBuffer sb=new StringBuffer();         //StringBuffer主要定义经常变化的字符串
        //经理让所有的职员找报表
        for (int i = 0; i <es.length ; i++) {
            sb.append(es[i].getReport());
        }
        return sb.toString();
    }
}
