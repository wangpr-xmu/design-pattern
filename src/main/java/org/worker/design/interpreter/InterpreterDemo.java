package org.worker.design.interpreter;

/**
 * 解释器模式
 * 给定一个语言，定义它的文法一种表示
 * 并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 */

public class InterpreterDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator("2 + 2 - 1");
        System.out.println(calculator.calculate());

    }
}
