package cn.ryanliu.task8;
/*
继承分两个方法写
 */
public class Pet {
    public void father(){
        System.out.println("这是父类");
    }
    public void show(){
        System.out.println("展示效果");
    }

    public static void main(String[] args) {
        Pet  p=new Pet();
        p.show();
        p.father();
    }
}
