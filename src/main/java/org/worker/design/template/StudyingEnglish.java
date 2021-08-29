package org.worker.design.template;

public class StudyingEnglish extends StudyingTemplate {

    @Override
    void preview() {
        System.out.println("预习英语课本");
    }

    @Override
    void review() {
        System.out.println("复习英语课内容");
    }
}
