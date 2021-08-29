package org.worker.design.memento;

/**
 * 备忘录模式
 * 不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态
 */
public class MementoDemo {
    public static void main(String[] args) {
        TextDraft textDraft = new TextDraft();

        TextEditor textEditor = new TextEditor("hello world", "java");

        textDraft.addMemento(textEditor.saveToMemento());

        textEditor.setContent("python");

        textDraft.addMemento(textEditor.saveToMemento());

        textEditor.setContent("go");

        System.out.println(textEditor.toString());

        textEditor.undoFromMemento(textDraft.getMemento());
        System.out.println(textEditor.toString());

        textEditor.undoFromMemento(textDraft.getMemento());

        System.out.println(textEditor.toString());


    }
}
