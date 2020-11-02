package org.worker.visitor;

import java.util.ArrayList;
import java.util.List;

public class StaffReports {
    List<Staff> staffs = new ArrayList<>();

    public StaffReports() {
        this.staffs.add(new Engineer("Engineer A"));
        this.staffs.add(new Engineer("Engineer B"));
        this.staffs.add(new Manager("Manager A"));
        this.staffs.add(new Engineer("Engineer C"));
        this.staffs.add(new Manager("Manager B"));
    }

    public void showReports(IVisitor visitor) {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
