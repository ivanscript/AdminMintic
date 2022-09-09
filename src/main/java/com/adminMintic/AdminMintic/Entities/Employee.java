package com.adminMintic.AdminMintic.Entities;

public class Employee {

    private String nameEmployee;
    private String documentEmployee;
    private String emailEmployee;
    private String rolEmployee;

    public Employee(String nameEmployee, String documentEmployee, String emailEmployee, String rolEmployee) {
        this.nameEmployee = nameEmployee;
        this.documentEmployee = documentEmployee;
        this.emailEmployee = emailEmployee;
        this.rolEmployee = rolEmployee;
    }

    public Employee(){}

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDocumentEmployee() {
        return documentEmployee;
    }

    public void setDocumentEmployee(String documentEmployee) {
        this.documentEmployee = documentEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getRolEmployee() {
        return rolEmployee;
    }

    public void setRolEmployee(String rolEmployee) {
        this.rolEmployee = rolEmployee;
    }
}
