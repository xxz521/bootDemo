package com.example.goodsCenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.bootDemo.entity.BaseEntity;
/**
 * 医院信息表
 * @author xxz
 */
@Entity
@Table(name="hospital")
public class Hospital extends BaseEntity{
	/**
	 */
	private static final long serialVersionUID = -7778271390569312819L;
	@Column(unique = true)
	private String hospitalCode;
	@Column
	private String hospitalName;
	@Column
	private String hospitalRemark;
	@Column
	private String hospitalStatus;
	@Column
	private String createUserId;
	@Column
	private String createUserName;
	@Column
	private String updateUserId;
	@Column
	private String updateUserName;
	
	public String getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalRemark() {
		return hospitalRemark;
	}
	public void setHospitalRemark(String hospitalRemark) {
		this.hospitalRemark = hospitalRemark;
	}
	public String getHospitalStatus() {
		return hospitalStatus;
	}
	public void setHospitalStatus(String hospitalStatus) {
		this.hospitalStatus = hospitalStatus;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getUpdateUserName() {
		return updateUserName;
	}
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
}
