package proxy.example;

public class RealSubject implements Subject{
    @Override
    public String doSomething(String msg) {
        System.out.println("RealSubject doSomething ---> msg: " + msg);
        return "处理完了，编号:" + msg;
    }
}
