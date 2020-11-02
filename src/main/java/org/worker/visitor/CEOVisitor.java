package org.worker.visitor;

public class CEOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + ", KPI: " + engineer.getKpi() + ", codes: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getName() + ", KPI: " + manager.getKpi() + ", products: " + manager.getProducts());
    }
}
