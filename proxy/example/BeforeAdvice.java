package proxy.example;

public class BeforeAdvice implements Advice {
    @Override
    public void exec() {
        System.out.println("BeforeAdvice deal ... ");
    }
}
