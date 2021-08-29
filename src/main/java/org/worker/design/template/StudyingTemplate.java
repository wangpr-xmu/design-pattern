package org.worker.design.template;

public abstract class StudyingTemplate {
    abstract void preview();

    public void attendClass() {
        System.out.println("听课");
    }

    abstract void review();

    public final void study() {
        //预习
        preview();
        //上课
        attendClass();
        //复习
        review();
    }

}
