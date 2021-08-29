package org.worker.design.chain;

/**
 * 责任链模式
 * 将链中的每一个节点看做一个对象，每个节点处理的请求均不同，且内部自动维护一个下一个节点对象
 * 当一个请求从链式的首端出发，会沿着链的路径依次传递给每一个节点对象，直至有对象处理这个请求为止
 */
public class ChainDemo {

    public static void main(String[] args) {

        Leader leader = new DirectLeader();
        Leader manager = new ManagerLeader();
        leader.setNextLeader(manager);

        LeaveRequest leaveRequest = new LeaveRequest("生病请假", 2);
        leader.handleRequest(leaveRequest);


    }
}
