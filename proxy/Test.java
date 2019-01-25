package proxy;

public class Test {

    public static void main(String[] args) {
        Subject proxy = new SubjectProxy(new RealSubject());
        proxy.request();
    }
}
