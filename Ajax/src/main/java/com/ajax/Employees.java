package com.ajax;

public class Employees {
    private String name;
    private String department;
    private String job;

    public Employees(String name, String department, String job) {
        this.name = name;
        this.department = department;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
