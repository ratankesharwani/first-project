package com.local.firstproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "studetn_id")
    private Integer studetnId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "contact")
    private String contact;
    @Basic
    @Column(name = "class")
    private String student_class;
    @Basic
    @Column(name = "department")
    private String department;

}
