package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User
{

    @Id
	@Column(name = "uid")
	int uid;

	@Column(name = "uname")
	String uname;

	@Column(name = "pwd")
	String password;
	
	@ManyToOne
	@JoinColumn(name = "rid")  // This maps to the 'rid' column in the current table
	private Role rid;

	@Column(name = "phone_no")
	String phone_no;

	@Column(name = "email")
	String email;
     
	@Column(name = "active")
	boolean active=true;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uname, String password, Role rid, String phone_no, String email,boolean active) {
		super();
		this.uname = uname;
		this.password = password;
		this.rid = rid;
		this.phone_no = phone_no;
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRid() {
		return rid;
	}
	public void setRid(Role rid) {
		this.rid = rid;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
