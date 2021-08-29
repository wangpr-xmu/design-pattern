package org.worker.design.memento;

public class TextEditor {
    private String title;
    private String content;

    public TextEditor(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public TextMemento saveToMemento() {
        return new TextMemento(this.title, this.content);
    }

    public void undoFromMemento(TextMemento textMemento) {
        this.title = textMemento.getTitle();
        this.content = textMemento.getContent();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
