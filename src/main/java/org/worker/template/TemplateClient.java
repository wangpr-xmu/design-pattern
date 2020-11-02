package org.worker.template;

public class TemplateClient {
    public static void main(String[] args) {
        StudyingTemplate en = new StudyingEnglish();
        en.study();
        StudyingTemplate math = new StudyingMath();
        math.study();
    }
}
