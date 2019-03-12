package com.example.bootDemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6320955820205619089L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	protected  Long id;
	@Column
	protected  String baseCreateTime;
	@Column
	protected  String baseUpdateTime;
	@Column
	protected  String createIp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBaseCreateTime() {
		return baseCreateTime;
	}
	public void setBaseCreateTime(String baseCreateTime) {
		this.baseCreateTime = baseCreateTime;
	}
	public String getBaseUpdateTime() {
		return baseUpdateTime;
	}
	public void setBaseUpdateTime(String baseUpdateTime) {
		this.baseUpdateTime = baseUpdateTime;
	}
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
}
