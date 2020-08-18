package com.test.tester.vo;

public class UserInsert {
	int ui_num;
	private String ui_name;
	private int ui_age;
	private String ui_birth;
	private String ui_id;
	private String ui_password;
	private int ui_phone;
	private String ui_email;
	private String ui_credat;
	private String ui_nickname;
	
	public int getUi_num() {
		return ui_num;
	}



	public void setUi_num(int ui_num) {
		this.ui_num = ui_num;
	}



	public String getUi_name() {
		return ui_name;
	}



	public void setUi_name(String ui_name) {
		this.ui_name = ui_name;
	}



	public int getUi_age() {
		return ui_age;
	}



	public void setUi_age(int ui_age) {
		this.ui_age = ui_age;
	}



	public String getUi_birth() {
		return ui_birth;
	}



	public void setUi_birth(String ui_birth) {
		this.ui_birth = ui_birth;
	}


	public String getUi_id() {
		return ui_id;
	}



	public void setUi_id(String ui_id) {
		this.ui_id = ui_id;
	}



	public String getUi_password() {
		return ui_password;
	}



	public void setUi_password(String ui_password) {
		this.ui_password = ui_password;
	}


	public int getUi_phone() {
		return ui_phone;
	}


	public void setUi_phone(int ui_phone) {
		this.ui_phone = ui_phone;
	}


	public String getUi_email() {
		return ui_email;
	}


	public void setUi_email(String ui_email) {
		this.ui_email = ui_email;
	}


	public String getUi_credat() {
		return ui_credat;
	}


	public void setUi_credat(String ui_credat) {
		this.ui_credat = ui_credat;
	}


	public String getUi_nickname() {
		return ui_nickname;
	}




	public void setUi_nickname(String ui_nickname) {
		this.ui_nickname = ui_nickname;
	}



	public UserInsert(int ui_num, String ui_name, int ui_age, String ui_birth, String ui_id, String ui_password,
			int ui_phone, String ui_email, String ui_credat, String ui_nickname) {
		super();
		this.ui_num = ui_num;
		this.ui_name = ui_name;
		this.ui_age = ui_age;
		this.ui_birth = ui_birth;
		this.ui_id = ui_id;
		this.ui_password = ui_password;
		this.ui_phone = ui_phone;
		this.ui_email = ui_email;
		this.ui_credat = ui_credat;
		this.ui_nickname = ui_nickname;
	}



//	String ui_name;
//	int ui_age;
//	String  ui_birth;
//	String ui_id;
//	String ui_password;
//	int ui_phone;
//	String ui_email;
//	String ui_credat;
//	String ui_nickname;
	
public static void main(String[] args) {
	
	
	String s = "UI_NUM, UI_NAME, UI_AGE, UI_BIRTH, UI_ID, UI_PASSWORD, UI_PHONE," + 
			"UI_EMAIL, UI_CREDAT, UI_NICKNAME";
}
}
