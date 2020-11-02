package org.worker.proxy.statical;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyEnTeacher proxyEnTeacher = new ProxyEnTeacher(new EnTeacher());
        proxyEnTeacher.givingALecture();
    }
}
