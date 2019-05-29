package javaclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person{
    private String name;
    private Integer age;
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    @Override
public  String  toString(){
        return "Person{"+"name='"+name+'\''+",age="+age+'}';
}

    @Override
    public boolean equals(Object o) {
        if(this==o)return  true;
        if(o==null||getClass()!=o.getClass())return  false;
        Person person=(Person) o;
        return Objects.equals(name,person.name)&&Objects.equals(age,person.age);
    }
    public String getName(){
        return name;
    }
public void setName(String name){
        this.name=name;

}
public Integer getAge(){
        return age;
}
public void setAge(Integer age){
        this.age=age;
}
    public static class TestDemo {
        public static void main(String[] args) {
            List<Person>  personList=new ArrayList<>();
            personList.add(new Person("张三",10));
            personList.add(new Person("李四",15));
            personList.add(new Person("王五",19));
            personList.remove(new Person("李四",15));
            System.out.println(personList.contains(new Person("王五",19)));
            for (Person p:personList)
            System.out.println(p);
        }
}
}