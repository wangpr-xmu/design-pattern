package org.worker.memento;

import java.util.Stack;

public class TextDraft {
    private final Stack<TextMemento> drafts = new Stack<>();

    public void addMemento(TextMemento memento) {
        drafts.push(memento);
    }

    public TextMemento getMemento() {
        return drafts.pop();
    }
}
