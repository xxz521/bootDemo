package com.example.customerCenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.bootDemo.entity.BaseEntity;
@Entity
@Table(name="user")
public class User extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6369343767010584000L;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column
	private String email;
	@Column
	private String nickName;
	@Column
	private String regTime;
	@Column
	private String mobile;
	@Column
	private Integer age;
	
	public User(){
		
	}
	public User(String nickName,String email,String userName,String passWord,String regTime){
		this.nickName=nickName;
		this.email=email;
		this.userName=userName;
		this.passWord=passWord;
		this.regTime=regTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
