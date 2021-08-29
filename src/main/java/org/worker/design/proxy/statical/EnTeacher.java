package org.worker.design.proxy.statical;

public class EnTeacher implements ITeacher {
    @Override
    public void givingALecture() {
        System.out.println("上英文课");
    }
}
