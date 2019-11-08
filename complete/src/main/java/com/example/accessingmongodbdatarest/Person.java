package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Person {

	@Id private String id;

	private String firstName;
	private String lastName;
	private String school;
	private String degree;
	private String email;
	private String yearofjoining;
	private String major;
	private String city;
	private String bio;

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	private int step;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYearofjoining() {
		return yearofjoining;
	}

	public void setYearofjoining(String yearofjoining) {
		this.yearofjoining = yearofjoining;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	private Address address;

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
}
