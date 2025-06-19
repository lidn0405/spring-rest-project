package com.example.Payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee(){}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Employee) {
            Employee employee = (Employee)other;
            return ((this.id == employee.getId()) && (this.name == employee.getName()) && (this.role == employee.getRole()));
        }

        return false;
    }

    @Override
    public String toString() {
        return ("Employee{ id: " + this.id + " name: " + this.name + " role: " + this.role);
    }
}
