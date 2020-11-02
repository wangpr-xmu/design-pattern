package org.worker.template;

public abstract class StudyingTemplate {
    abstract void preview();
    abstract void attendClass();
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
