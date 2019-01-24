package template;

public abstract class AbstractClass {

    protected abstract void doSomething();

    protected abstract void doAnything();

    protected abstract void doOther();

    public void templateMethod() {
        doSomething();
        doAnything();
        if (isOther()) {
            doOther();
        }
    }

    protected boolean isOther() {
        return true;
    }
}
