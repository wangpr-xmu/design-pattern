package org.worker.design.chain;

public class DirectLeader extends Leader {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getDay() < 3) {
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
