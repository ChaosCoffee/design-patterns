package chain;

public abstract class Handler {

    private Handler nextHandler;

    public final Response handlerMessage(Request request) {
        if (request == null || request.getLevel() == null) {
            return null;
        }
        Response response = null;
        if (this.getHandlerLevel() == request.getLevel()) {
            response = this.echo();
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handlerMessage(request);
            } else {
                System.out.println("Next handler not found!");
            }
        }
        return response;
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract Response echo();

    public abstract Level getHandlerLevel();

    public enum Level {
        FIRST,
        SECOND,
        THIRD;
    }

}
