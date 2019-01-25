package proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        if (true) {
            Advice advice = new BeforeAdvice();
            advice.exec();
        }
        Class<?> clazz = subject.getClass();
        //获得ClassLoader
        ClassLoader classLoader = clazz.getClassLoader();
        //获取接口数据
        Class<?>[] interfaces = clazz.getInterfaces();
        //获得Handler
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }

}
