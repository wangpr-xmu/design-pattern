package org.worker.design.proxy.statical;

public class ProxyEnTeacher implements ITeacher {
    private EnTeacher enTeacher;

    public ProxyEnTeacher(EnTeacher enTeacher) {
        this.enTeacher = enTeacher;
    }

    @Override
    public void givingALecture() {
        before();
        enTeacher.givingALecture();
        after();
    }

    private void before() {
        System.out.println("打开PPT");
    }

    private void after() {
        System.out.println("关闭PPT");
    }
}
