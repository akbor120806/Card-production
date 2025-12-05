package com.example.card_production.Akbor;

import java.io.Serializable;

public class StaffPerformance implements Serializable {
    protected String staffName,department;
    protected int performanceScore, attendance;

    public StaffPerformance() {
    }

    public StaffPerformance(String staffName, String department, int performanceScore, int attendance) {
        this.staffName = staffName;
        this.department = department;
        this.performanceScore = performanceScore;
        this.attendance = attendance;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "StaffPerformance{" +
                "staffName='" + staffName + '\'' +
                ", department='" + department + '\'' +
                ", performanceScore=" + performanceScore +
                ", attendance=" + attendance +
                '}';
    }



}
