package com.pride.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "f_name", nullable = false)
	private String fname;

	@Column(name = "l_name", nullable = false)
	private String lname;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "has_account", nullable = false)
	private boolean hasAccount;

	@Column(name = "open_application", nullable = false)
	private boolean hasApplied;

	private String userType;

	public User() {
	}

	public User(String fname, String lname, String username, String password, String email, boolean hasAccount,
			boolean hasApplied, String userType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.hasAccount = hasAccount;
		this.hasApplied = hasApplied;
		this.userType = userType;
	}

	public User(int id, String fname, String lname, String username, String password, String email, boolean hasAccount,
			boolean hasApplied, String userType) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.hasAccount = hasAccount;
		this.hasApplied = hasApplied;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isHasAccount() {
		return hasAccount;
	}

	public void setHasAccount(boolean hasAccount) {
		this.hasAccount = hasAccount;
	}

	public boolean isHasApplied() {
		return hasApplied;
	}

	public void setHasApplied(boolean hasApplied) {
		this.hasApplied = hasApplied;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username + ", password="
				+ password + ", email=" + email + ", hasAccount=" + hasAccount + ", hasApplied=" + hasApplied
				+ ", userType=" + userType + "]";
	}

}
