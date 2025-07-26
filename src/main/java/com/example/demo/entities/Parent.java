package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    private String paddress;
    private String adhar;
    private String fname;
    private String lname;
    private String occupation;
    private int uid;

    // Default constructor
    public Parent() {
    }

    // Parameterized constructor
    public Parent(String paddress, String adhar, String fname, String lname, String occupation, int uid) {
        this.paddress = paddress;
        this.adhar = adhar;
        this.fname = fname;
        this.lname = lname;
        this.occupation = occupation;
        this.uid = uid;
    }

    // Getters and Setters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}