package cn.ryanliu.task8;
/*
这是简单的继承
 */
public class Petson extends Pet {
    public void brode(){
        System.out.println("这是子类");
    }
    public static void main(String[] args) {
        Petson p1=new Petson();
        p1.father();
        p1.show();
        p1.brode();
    }
}
