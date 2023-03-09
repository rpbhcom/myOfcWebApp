package com.myoffice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "t_user_master")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private long id;
	
	@Column(name="username" ,nullable=false,length=10)
	private String username;
	
	@Column(name="password",nullable=false,length=100)
	@JsonIgnore
	private String password;
	
	@Column(name="first_name",length=30)
	private String firstName;
	
	@Column(name="last_name",length=20)
	private String lastName;
	
	@Column(name="email_id" ,nullable=false,length=50)
	private String email;
	
	@Column(name="mobile_no" ,nullable=false,length=10)
	private long mobile;
	
	@Column(name="create_date",nullable=false)
	private Date creatDate;
	
	@Column(name="modified_date")
	private Date modifiedDate;
	
	@Column(name="is_locked",nullable=false,length=1)
	private int isLocked;
	
	@Column(name="is_deleted",nullable=false,length=1)
	private int isDeleted;
	
	@Column(name="password_exp_date",nullable=false)
	private Date passExpDate;
	
	@Column(name="wrong_login",nullable=false,length=1)
	private int wrongLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(int isLocked) {
		this.isLocked = isLocked;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getPassExpDate() {
		return passExpDate;
	}

	public void setPassExpDate(Date passExpDate) {
		this.passExpDate = passExpDate;
	}

	public int getWrongLogin() {
		return wrongLogin;
	}

	public void setWrongLogin(int wrongLogin) {
		this.wrongLogin = wrongLogin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}