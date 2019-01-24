package template;

public class Test {
    public static void main(String[] args) {
        ConcreteClassA a = new ConcreteClassA();
        ConcreteClassB b = new ConcreteClassB();
        //控制模板中某个实践是否执行
        a.setOtherFlag(false);
        //模板方法
        a.templateMethod();
        b.templateMethod();
    }
}
