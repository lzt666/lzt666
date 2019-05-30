public interface IA {
    void function1();
}
interface IB{
    void function();
}
abstract class B implements IA{
    public abstract void func2();
}
class C extends B{
    @Override
    public void function1() {

    }

    @Override
    public void func2() {

    }
}
