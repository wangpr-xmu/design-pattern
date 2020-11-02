package org.worker.component;

public class ComponentClient {
    public static void main(String[] args) {
        Directory f1 = new FileDirectory("f1.doc");
        Directory f2 = new FileDirectory("f2.doc");
        Directory f3 = new FileDirectory("f3.doc");

        FolderDirectory folder = new FolderDirectory("document");
        folder.add(f1);
        folder.add(f2);
        folder.add(f3);

        folder.show();

    }
}
