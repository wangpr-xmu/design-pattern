package org.worker.design.proxy.dynamic;


import org.worker.design.proxy.dynamic.cglib.ITeacherCglibProxy;
import org.worker.design.proxy.dynamic.jdk.ITeacherJdkProxy;

/**
 * 代理模式
 * 为一个对象提供代理对象，控制这个对象的访问
 */

public class DynamicProxyDemo {

    public static void main(String[] args) {

        ITeacher iTeacher1 = new ITeacherJdkProxy(new EnTeacher()).getInstance();
        iTeacher1.givingALecture();

        EnTeacher enTeacher = (EnTeacher) new ITeacherCglibProxy().getInstance(new EnTeacher().getClass());
        enTeacher.givingALecture();

    }
}
