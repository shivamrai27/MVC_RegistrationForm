package com.entity;

//import lombok.Data;

//@Data ////Lombok is not working so i made getter setter cons manually 
public class Student {

	private int id;
	private String name;
	private String email;
	private String dob;
	private String address;
	private String phone;
	private String gender;

//	public Student(String name, String email, String dob, String address, String phone, String gender,
//			String password) {
//		super();
////		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.dob = dob;
//		this.address = address;
//		this.phone = phone;
//		this.gender = gender;
//		this.password = password;
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", address=" + address
				+ ", phone=" + phone + ", gender=" + gender + ", password=" + password + "]";
	}

}