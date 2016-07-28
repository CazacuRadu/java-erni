package ro.erni.java.training.ojects;

import java.time.LocalDate;

public class Student {

	private String firstName;

	private String lastName;

	private LocalDate birthday;

	private float average;

	public Student(String fName, String lName, LocalDate dob, float avg) {
		firstName = fName;
		lastName = lName;
		birthday = dob;
		average = avg;
	}
	
	public Student(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public String getFName() {
		return firstName;
	}

	public String getLName() {
		return lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public float getAverage() {
		return average;
	}

	public void setFName(String fName) {
		firstName = fName;
	}

	public void setLName(String lName) {
		lastName = lName;
	}

	public void setDOB(LocalDate dob) {
		birthday = dob;
	}

	public void setAvg(float avg) {
		average = avg;
	}
	
	@Override
	public String toString() {

		return firstName + " " + lastName;
	}
}
