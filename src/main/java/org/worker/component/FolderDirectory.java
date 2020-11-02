package org.worker.component;

import java.util.ArrayList;
import java.util.List;

public class FolderDirectory extends Directory {
    private List<Directory> dirs;

    public FolderDirectory(String name) {
        super(name);
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        for(Directory d : dirs) {
            System.out.println(d.name);
        }
    }

    public void add(Directory directory) {
        dirs.add(directory);
    }

    public void remove(int index) {
        dirs.remove(index);
    }
}
