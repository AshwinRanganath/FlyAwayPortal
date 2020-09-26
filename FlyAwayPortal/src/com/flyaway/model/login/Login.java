package com.flyaway.model.login;

public class Login {

	private String name;
	private String gender;
	private String username;
	private String contact;
	private String password;
	private String email;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Login() {
		//super();
	}
	@Override
	public String toString() {
		return "Login [name=" + name + ", gender=" + gender + ", username=" + username + ", contact=" + contact
				+ ", password=" + password + ", email=" + email + ", role=" + role + "]";
	}
	
	
}
