abstract class Subject{
    abstract public void request();
}
class RealSubject extends Subject//红酒厂商
{
    @Override
    public void request() {//实现抽象方法
        System.out.println("我是红酒厂商，欢迎品尝购买本品牌的红酒");
    }
}

class ProxySubject extends Subject
{
    private RealSubject realSubject;

    @Override
    public void request() {
        preRequest();
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.request();
        postRequest();
    }
    private void preRequest(){
        System.out.println("广告宣传，免费品尝");
    }
    private void postRequest(){
        System.out.println("付款购买");
    }
}


public class Proxytest {
    public static void main(String[] args) {
        Subject sub=new ProxySubject();
        sub.request();

        }
    }

