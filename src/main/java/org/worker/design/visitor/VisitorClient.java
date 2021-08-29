package org.worker.design.visitor;

public class VisitorClient {
    public static void main(String[] args) {
        StaffReports reports = new StaffReports();
        System.out.println("=======CTO查看报表=======");
        reports.showReports(new CTOVisitor());
        System.out.println("============CEO查看报表===========");
        reports.showReports(new CEOVisitor());
    }
}
