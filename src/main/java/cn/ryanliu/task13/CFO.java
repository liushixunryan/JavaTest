package cn.ryanliu.task13;
/*
定义财务总监类
 */
public class CFO {
    Manager[] ms;
    public CFO(Manager[] ms){
        this.ms=ms;
    }
    //定义CFO找报表的方法,CFO只向经理要报表
    public String getReport(){
        try {
            return ms[0].getReport();
        } catch (Exception e) {
            e.printStackTrace();        //打印异常的栈信息
        }
        return null;
    }
}
