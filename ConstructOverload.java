import caiquan.Person;

public class ConstructOverload {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.talk();

    }
}
class Person1{
    private String name;
    private int age;

    public Person1(){
        name="luzhou" ;
    age=22;
    }
    public Person1(int age){
        name="luzhou";
        this.age=age;
    }
    public  Person1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void talk(){
        System.out.println("我叫:"+name+"我今年:"+age+"岁");
    }
}