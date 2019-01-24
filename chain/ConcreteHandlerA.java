package chain;

public class ConcreteHandlerA extends Handler {
    @Override
    public Response echo() {
        return new Response("处理 A--->完成");
    }

    @Override
    public Level getHandlerLevel() {
        return Level.FIRST;
    }
}
