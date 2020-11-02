package org.worker.memento;

public class MementoClient {
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
