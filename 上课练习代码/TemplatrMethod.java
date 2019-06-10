
abstract  class Action

{
    public static final int EAT=1;
    public  static final int WORK=2;
    public  static final int SLEEP=5;
    public  static final int RUN=10;
    public  abstract void eat();//声明抽象方法eat
    public  abstract void work();//声明抽象方法work
    public  abstract void sleep();//声明抽象方法sleep
    public  abstract void run();//声明抽象方法run
    public void command(int ch){//具体的命令
        switch (ch){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case  RUN:
                this.run();
                break;
            case EAT+WORK:
                this.eat();
                this.work();
                break;
            case EAT+SLEEP+RUN:
                this.eat();
                this.run();
                this.sleep();
                break;
            case EAT+SLEEP+RUN+WORK:
                this.sleep();
                this.run();
                this.work();
                this.eat();
                break;
        }
    }

}
class Robot extends Action{//定义子类机器人行为
    public void eat(){//实现抽象方法
        System.out.println("为机器人加燃料！！");
    }

    public void sleep(){}
    public void run(){}
    public void work(){}
    {
        System.out.println("让机器人开始工作");
    }
}
class Women extends Action{//定义子类美女行为
    public void eat(){
        System.out.println("请美女吃饭");
    }

    public void sleep(){
        System.out.println("让美女睡美容觉");
    }
    public void run(){
        System.out.println("让美女跑步健身");
    }
    public void work(){}

}
class Man extends Action{//定义子类帅哥行为
    public void eat(){
        System.out.println("帅哥吃早饭");
    }

    public void sleep(){
        System.out.println("帅哥休息");
    }
    public void run(){
        System.out.println("帅哥去健身房健身");
    }
    public void work(){
        System.out.println("帅哥为了和美女好好生活，努力工作");
    }

}


public class TemplatrMethod {
    public static void main(String[] args) {


        Action actA = new Robot();//机器人行为
        actA.command(Action.EAT);
        actA.command(Action.WORK);
        Action actB = new Women();//美女的行为
        actB.command(Action.EAT + Action.SLEEP + Action.RUN);
        Action actC = new Man();
        actC.command(Action.EAT + Action.RUN + Action.SLEEP + Action.WORK);


    }

}