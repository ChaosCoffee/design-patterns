package chain;

public class Request {

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
