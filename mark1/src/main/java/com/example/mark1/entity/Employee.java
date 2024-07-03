package com.example.mark1.entity;


import com.example.mark1.enums.DepartmentType;
import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {


    public Employee(Long id, String name, DepartmentType department) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="department")
    private DepartmentType department;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }
}
