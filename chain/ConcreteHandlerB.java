package chain;

public class ConcreteHandlerB extends Handler {
    @Override
    public Response echo() {
        return new Response("处理 B--->完成");
    }

    @Override
    public Level getHandlerLevel() {
        return Level.SECOND;
    }
}
