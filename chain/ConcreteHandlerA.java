package chain;

public class ConcreteHandlerA extends Handler {
    @Override
    public Response echo(Request request) {
        return new Response("处理 A--->完成，处理用户:" + request.getName());
    }

    @Override
    public Level getHandlerLevel() {
        return Level.FIRST;
    }
}
