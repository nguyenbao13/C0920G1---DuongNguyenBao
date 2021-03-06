package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    @Column
    private String employeeName;
//    private String employeeBirthday;
//    private String employeeIdCard;
//    private String employeeSalary;
//    private String employeePhone;
//    private String employeeEmail;
//    private String employeeAddress;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeBirthday, String employeeIdCard,
                    String employeeSalary, String employeePhone, String employeeEmail, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
//        this.employeeBirthday = employeeBirthday;
//        this.employeeIdCard = employeeIdCard;
//        this.employeeSalary = employeeSalary;
//        this.employeePhone = employeePhone;
//        this.employeeEmail = employeeEmail;
//        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    public String getEmployeeBirthday() {
//        return employeeBirthday;
//    }
//
//    public void setEmployeeBirthday(String employeeBirthday) {
//        this.employeeBirthday = employeeBirthday;
//    }
//
//    public String getEmployeeIdCard() {
//        return employeeIdCard;
//    }
//
//    public void setEmployeeIdCard(String employeeIdCard) {
//        this.employeeIdCard = employeeIdCard;
//    }
//
//    public String getEmployeeSalary() {
//        return employeeSalary;
//    }
//
//    public void setEmployeeSalary(String employeeSalary) {
//        this.employeeSalary = employeeSalary;
//    }
//
//    public String getEmployeePhone() {
//        return employeePhone;
//    }
//
//    public void setEmployeePhone(String employeePhone) {
//        this.employeePhone = employeePhone;
//    }
//
//    public String getEmployeeEmail() {
//        return employeeEmail;
//    }
//
//    public void setEmployeeEmail(String employeeEmail) {
//        this.employeeEmail = employeeEmail;
//    }
//
//    public String getEmployeeAddress() {
//        return employeeAddress;
//    }
//
//    public void setEmployeeAddress(String employeeAddress) {
//        this.employeeAddress = employeeAddress;
//    }
}
