package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "child")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    @Column
    private String cname;

    @Column
    private String dob;

    @Column
    private double height;

    @Column
    private double weight;

    @Column
    private String bgroup;

    @Column
    private String gender;

    @Column(name = "medical_history")
    private String medicalHistory;

    @Column
    private int pid;

    
    public Child() {
    }

   
    public Child(String cname, String dob, double height, double weight,
                 String bgroup, String gender, String medicalHistory, int pid) {
        this.cname = cname;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.bgroup = bgroup;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
        this.pid = pid;
    }

    // Getters and Setters
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}