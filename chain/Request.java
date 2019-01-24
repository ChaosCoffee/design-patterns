package chain;

public class Request {

    private Handler.Level level;

    public Request(Handler.Level level) {
        this.level = level;
    }

    public Handler.Level getLevel() {
        return level;
    }

    public void setLevel(Handler.Level level) {
        this.level = level;
    }
}
