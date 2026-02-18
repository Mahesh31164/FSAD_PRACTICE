/*package com.klu.model;

import javax.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "empname")
    private String empname;

    @Column(name = "salary")
    private double salary;

    @ManyToOne
    @JoinColumn(name = "deptid")
    private Department department;

    // ===== getters & setters =====

    public int getEmpId() {
        return empid;
    }

    public void setEmpId(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empname;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public double getEmpSalary() {
        return salary;
    }

    public void setEmpSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
*/