package com.flyaway.model.passenger;

public class Passenger {
	
	private String p_name;
	private String p_sex;
	private String user_name;
	private int p_age;
	private int p_id;
	public Passenger() {
		
		
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_sex() {
		return p_sex;
	}
	public void setP_sex(String p_sex) {
		this.p_sex = p_sex;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	@Override
	public String toString() {
		return "Passenger [p_name=" + p_name + ", p_sex=" + p_sex + ", user_name=" + user_name + ", p_age=" + p_age
				+ ", p_id=" + p_id + "]";
	}
	
	

}
