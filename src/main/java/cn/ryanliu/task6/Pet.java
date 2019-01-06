package cn.ryanliu.task6;
/*  宠物之家
* 宠物医院管理系统,用于对宠物信息进行管理
* 宠物的信息包括名字,年龄,颜色,体重
* 宠物能叫.吃.玩.跳.跑.睡觉等.
* */

public class Pet {
    public String name;     //定义宠物的名字
    public int age;         //定义宠物的年龄
    public String color;    //定义宠物的颜色
    public double weight;   //定义宠物的体重

    //定义show()方法,打印输出宠物的信息
    public void show(){
        System.out.println(name+",今年"+age+"岁,是"+color+"颜色,体重是:"+weight+"千克");
    }
    //定义"叫"的方法,并输出一段话
    public void speak(){
        System.out.println(name+"说,我会说话,但是人类听不懂我说什么");
    }
    //定义"吃"的方法,并传入string类型的food
    public void eat(String food){
        System.out.println(name+"喜欢吃"+food);
    }
    //定义"玩"的方法,这里传入了主人的名字
    public void playWithOwner(String ownerName){
        System.out.println(ownerName+"和他的宠物"+name+"玩的好开心啊");
    }
    //定义"跳"的方法,传入double类型的参数height
    public void jump(double height){
        if (height>10.0){
            System.out.println(name+"好厉害啊,跳的好高啊,它的体重只有"+weight+"千克");
        }
        else {
            System.out.println(name+"太胖了,跳不动啊,它的体重竟然有"+weight+"千克");
        }
    }
    //定义"跑"的方法,传double类型的参数distance
    public void run(double distance){
        if (distance>100){
            System.out.println(name+"真厉害,跑的真远啊,他居然跑了"+distance+"米");
        }
        else {
            System.out.println(name+"太胖了,跑不动呦,他的体重竟然有"+distance+"米");
        }
    }
    //定义"睡"的方法,传入int型参数time
    public void sleep(int time){
        if (time>3){
            System.out.println(name+"美美的睡了一觉,他已经睡了"+time+"小时");
        }
        else {
            System.out.println(name+"小憩了一会,只睡了"+time+"小时");
        }
    }

    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.name="狗狗";
        pet.age=2;
        pet.color="棕色";
        pet.weight=5.4;
        pet.show();
        pet.speak();
        pet.eat("狗粮");
        pet.playWithOwner("ryan");
        pet.jump(12.5);
        pet.run(200.6);
        pet.sleep(5);

    }
}
