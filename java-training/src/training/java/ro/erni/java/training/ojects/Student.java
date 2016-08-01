package ro.erni.java.training.ojects;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Student {

	private String firstName;

	private String lastName;

	private LocalDate birthday;

	private float average;
	
	private LocalDate today = LocalDate.now();
	
	private List<Integer> mark = new ArrayList<>();

	public Student(String fName, String lName, LocalDate dob, float avg, List<Integer> marks) {
		this.firstName = fName;
		this.lastName = lName;
		this.birthday = dob;
		this.average = avg;
		this.mark = marks;
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
	
	public List<Integer> getMarks() {
		return mark;
	}

	public void setFName(String fName) {
		this.firstName = fName;
	}

	public void setLName(String lName) {
		this.lastName = lName;
	}

	public void setDOB(LocalDate dob) {
		this.birthday = dob;
	}

	public void setAvg(float avg) {
		this.average = avg;
	}
	
	public void setMarks(List<Integer> marks) {
		this.mark = marks;
	}
	
	@Override
	public String toString() {

		return firstName + " " + lastName;
	}
	
	public Period getAge() {
		Period p = Period.between(birthday, today);
		return p;
	}
}
