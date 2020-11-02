package org.worker.proxy.dynamic.jdk;

import com.coder.proxy.dynamic.ITeacher;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ITeacherJdkProxy implements InvocationHandler {
    private ITeacher iTeacher;

    public ITeacherJdkProxy(ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    public ITeacher getInstance() {
        return (ITeacher) Proxy.newProxyInstance(
                iTeacher.getClass().getClassLoader(),
                iTeacher.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        System.out.println(proxy.getClass());
        Object result = method.invoke(iTeacher, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("打开PPT");
    }
    private void after() {
        System.out.println("关闭PPT");
    }
}
