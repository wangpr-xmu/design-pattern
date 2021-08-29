package org.worker.design.visitor;

public interface IVisitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
