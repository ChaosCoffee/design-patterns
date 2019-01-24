package chain;

public class ConcreteHandlerC extends Handler {
    @Override
    public Response echo() {
        return new Response("处理 C--->完成");
    }

    @Override
    public Level getHandlerLevel() {
        return Level.THIRD;
    }
}
