package org.worker.chain;

public class ChainClient {
    public static void main(String[] args) {
        Leader leader = new DirectLeader();
        Leader manager = new ManagerLeader();
        leader.setNextLeader(manager);

        LeaveRequest leaveRequest = new LeaveRequest("生病请假", 2);
        leader.handleRequest(leaveRequest);


    }
}
