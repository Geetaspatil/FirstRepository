package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hid;

    private String hname;
    private String regno;
    private String telno;
    private int uid;

    // Default constructor
    public Hospital() {
    }

    // Parameterized constructor
    public Hospital(String hname, String regno, String telno, int uid) {
        this.hname = hname;
        this.regno = regno;
        this.telno = telno;
        this.uid = uid;
    }

    // Getters and setters
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}