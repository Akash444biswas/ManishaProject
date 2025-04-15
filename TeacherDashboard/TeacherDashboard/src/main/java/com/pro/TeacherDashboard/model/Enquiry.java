package com.pro.TeacherDashboard.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "enquiries")
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enquiryId;
    
    private String name;
    private String mobileNumber;
    private String subject;
    
    @Column(name = "class_name")
    private String className;
    
    private String teachingMode;
}