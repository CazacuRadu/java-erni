package ro.erni.java.training.object.execution;

import java.util.Collections;
import java.util.List;
import ro.erni.java.training.ojects.Student;

public class StudentSort implements StudentInitialization {

	// sort alphabetically by First Name
	public List<Student> sortByFname() {
		st.sort((s1, s2) -> s1.getFName().compareTo(s2.getFName()));
		return st;
	}

	public void displaysortByFname() {
		// st.sort((s1, s2) -> s1.getFName().compareTo(s2.getFName()));
		sortByFname();
		st.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName()));
	}

	// sort alphabetically by Last Name
	public void sortByLname() {
		st.sort((s1, s2) -> s1.getLName().compareTo(s2.getLName()));
		st.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName()));

	}

	// sort chronologically
	public void sortChronologically() {
		st.sort((s1, s2) -> s1.getBirthday().compareTo(s2.getBirthday()));
		st.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getBirthday()));

	}

	// sort by average mark
	public void sortAvgMark() {
		st.sort((s1, s2) -> Float.compare(s1.getAverage(), s2.getAverage()));
		Collections.reverse(st);
		st.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getAverage()));

	}

	public void sortAvgMark10() {
		st.stream().filter(s -> s.getAverage() == 10)
				.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getAverage()));
	}

	public void birthdayOn1991() {
		st.stream().filter(s -> s.getBirthday().getYear() == 1991)
				.forEach((s) -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getBirthday()));
	}

//	public boolean isArraySorted() {
//		for (int i = 1; i < strings2.size(); i++) {
//			        if (strings2.get(i-1).compareTo(strings2.get(i)) > 0) 
//						sorted = false;
//			    }
//		return false;
//	}

}
