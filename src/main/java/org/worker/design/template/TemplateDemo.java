package org.worker.design.template;

/**
 * 模板方法模式
 * 定义一个算法的骨架，允许子类实现其中的一个或多个步骤
 */

public class TemplateDemo {
    public static void main(String[] args) {

        StudyingTemplate en = new StudyingEnglish();
        en.study();

        StudyingTemplate math = new StudyingMath();
        math.study();
    }
}
