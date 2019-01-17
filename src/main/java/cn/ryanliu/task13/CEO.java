package cn.ryanliu.task13;
/*
定义首席执行官类
 */
public class CEO {
    CFO cfo;
    public CEO(CFO cfo){
        this.cfo=cfo;
    }
    //定义CEO找报表的方法,调用CFO去找报表
    public String getReport(){

        return cfo.getReport();
    }
}
