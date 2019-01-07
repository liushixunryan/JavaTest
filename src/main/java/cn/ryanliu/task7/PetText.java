package cn.ryanliu.task7;
/*
简单的方法重载
 */
public class PetText {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    public PetText(){
        this.name="旺旺";
        this.age=12;
    }
    public PetText(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println(name+"今年"+age+"岁了");
    }

    public static void main(String[] args) {
        PetText pet1=new PetText();
        PetText pet2=new PetText("点点",21);
        pet1.show();
        pet2.show();
    }
}
