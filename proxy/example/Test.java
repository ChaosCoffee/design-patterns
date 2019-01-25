package proxy.example;

public class Test {

    public static void main(String[] args) {
        //定义主题
        Subject subject = new RealSubject();
        //获取代理类
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("A100");

    }
}
