package org.worker.design.visitor;

import java.util.Random;

public abstract class Staff {
    protected String name;
    protected int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(5);
    }

    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }
}
