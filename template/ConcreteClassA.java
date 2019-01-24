package template;

public class ConcreteClassA extends AbstractClass {

    private boolean otherFlag = true;

    @Override
    protected void doSomething() {
        System.out.println("A do something");
    }

    @Override
    protected void doAnything() {
        System.out.println("A do anything");
    }

    @Override
    protected void doOther() {
        System.out.println("A do other");
    }

    @Override
    protected boolean isOther() {
        return otherFlag;
    }

    public void setOtherFlag(boolean otherFlag) {
        this.otherFlag = otherFlag;
    }
}
