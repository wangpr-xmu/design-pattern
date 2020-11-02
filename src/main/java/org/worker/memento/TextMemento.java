package org.worker.memento;

public class TextMemento {
    private String title;
    private String content;

    public TextMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
