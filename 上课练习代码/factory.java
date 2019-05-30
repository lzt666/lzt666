interface Fruit
{
  public void  eat();
}
class Apple implements Fruit
{
    public void eat()
    {
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit
{
    public void eat()
    {
        System.out.println("吃橘子");
    }
}

class  Factory1 {
    public static Fruit getInstance(String className) {


        if ("apple".equals(className)) {
            return new Apple();
        }
        if ("orange".equals(className)) {
            return new Orange();
        }
         return null;
    }
}

public class factory
{
    public static void main(String args[])
    {
        Fruit f=Factory1.getInstance(args[0]);
        f.eat();
    }
}
