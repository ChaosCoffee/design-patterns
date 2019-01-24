package chain;

public class HandlerExecutor {

    public Response handler(Request request) {
        //定义责任链
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        //设置顺序
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        return handlerA.handlerMessage(request);
    }


}
