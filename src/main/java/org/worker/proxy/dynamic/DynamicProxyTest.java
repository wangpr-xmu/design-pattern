package org.worker.proxy.dynamic;

import com.coder.proxy.dynamic.cglib.ITeacherCglibProxy;
import com.coder.proxy.dynamic.jdk.ITeacherJdkProxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        ITeacher iTeacher1 = new ITeacherJdkProxy(new EnTeacher()).getInstance();
        iTeacher1.givingALecture();

        EnTeacher enTeacher = (EnTeacher) new ITeacherCglibProxy().getInstance(new EnTeacher().getClass());
        enTeacher.givingALecture();
    }
}
