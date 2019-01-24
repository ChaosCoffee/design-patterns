package template;

public class ConcreteClassB extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("B do something");
    }

    @Override
    protected void doAnything() {
        System.out.println("B do anything");
    }

    @Override
    protected void doOther() {
        System.out.println("B do other");
    }
}
