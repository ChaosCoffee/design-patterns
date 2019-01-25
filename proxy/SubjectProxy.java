package proxy;

public class SubjectProxy implements Subject{
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before() {
        System.out.println("SubjectProxy ... before ");
    }

    public void after() {
        System.out.println("SubjectProxy ... after ");
    }
}
