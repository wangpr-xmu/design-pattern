package org.worker.design.visitor;

public class CTOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + ", codes: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + ", products: " + manager.getProducts());
    }
}
