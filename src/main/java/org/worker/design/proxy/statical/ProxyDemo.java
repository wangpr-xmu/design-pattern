package org.worker.design.proxy.statical;

public class ProxyDemo {
    public static void main(String[] args) {
        ProxyEnTeacher proxyEnTeacher = new ProxyEnTeacher(new EnTeacher());
        proxyEnTeacher.givingALecture();
    }
}
