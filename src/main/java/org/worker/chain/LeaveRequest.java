package org.worker.chain;

public class LeaveRequest {
    private String reason;
    private int day;

    public LeaveRequest(String reason, int day) {
        this.reason = reason;
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
