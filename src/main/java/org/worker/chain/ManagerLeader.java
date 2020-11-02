package org.worker.chain;

public class ManagerLeader extends Leader {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 6) {
            System.out.println(this.getClass().getSimpleName() + ", 批准" + leaveRequest.getReason());
        }else {
            if(this.getNextLeader() != null) {
                this.getNextLeader().handleRequest(leaveRequest);
            }else {
                System.out.println("没有人能批准");
            }
        }
    }
}
