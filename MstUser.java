package jp.co.internous.react.model.domain;

import java.sql.Timestamp;

import jp.co.internous.react.model.form.UserForm;

public class MstUser{
	
	private long id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	//DB(tinyint型) Java(int型)を使用
	private int gender;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	
	//インスタンス化の際に初期設定せず、一つずつSetterでデータをセット 
	public MstUser(){}
	
	//MstUserを受け取りデータをセット 
	public MstUser(UserForm userForm) {
		userName = userForm.getUserName();
		password = userForm.getPassword();
		familyName = userForm.getFamilyName();
		firstName = userForm.getFirstName();
		familyNameKana = userForm.getFamilyNameKana();
		firstNameKana = userForm.getFirstNameKana();
		gender = userForm.getGender();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}


}
