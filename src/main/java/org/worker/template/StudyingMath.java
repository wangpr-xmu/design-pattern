package org.worker.template;

public class StudyingMath extends StudyingTemplate {
    @Override
    void preview() {
        System.out.println("预习数学课本");
    }

    @Override
    void attendClass() {
        System.out.println("上数学课");
    }

    @Override
    void review() {
        System.out.println("复习数学课内容");
    }
}
