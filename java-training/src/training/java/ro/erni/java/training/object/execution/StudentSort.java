package ro.erni.java.training.object.execution;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName()));
	}

	// sort alphabetically by Last Name
	public void sortByLname() {
		st.sort((s1, s2) -> s1.getLName().compareTo(s2.getLName()));
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName()));

	}

	// sort chronologically
	public void sortChronologically() {
		st.sort((s1, s2) -> s1.getBirthday().compareTo(s2.getBirthday()));
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getBirthday()));

	}

	// sort by average mark
	public void sortAvgMark() {
		st.sort((s1, s2) -> Float.compare(s1.getAverage(), s2.getAverage()));
		Collections.reverse(st);
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getAverage()));

	}

	public void sortAvgMark10() {
		st.stream().filter(s -> s.getAverage() == 10)
				.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getAverage()));
	}

	public void birthdayOn1991() {
		st.stream().filter(s -> s.getBirthday().getYear() == 1991)
				.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getBirthday()));
	}

	public void studentLastNameFilterByLetter(String letter) {
		boolean anyMatch = st.stream().findAny().get().getLName().startsWith(letter.toUpperCase());
		List<Student> fil = st.stream().filter(s -> s.getLName().contains(letter)).collect(Collectors.toList());
		fil.forEach(s -> System.out.println(s));
		System.out.println("Number of students with letter c in them is :" + fil.size());
		System.out.println("There are students whose name start with : " + letter.toUpperCase() + anyMatch);

	}

	public void groupStudentsByCategory() {
		Map<Object, List<Student>> collect = st.stream().collect(Collectors.groupingBy(s -> s.getFName()));
		Map<Object, List<Student>> collect2 = st.stream().collect(Collectors.groupingBy(s -> s.getAge().getYears()));
		System.out.println("Group by First Name : " + collect);
		System.out.println("Group by  Age : " + collect2);

	}

	public void retrieveMarksComputeAvg() {
		for (Student student : st) {
			double avg = student.getMarks().stream().mapToInt(val -> val).average().getAsDouble();
			System.out.println("Student marks and average is: " + student.getFName() + " " + student.getLName()
					+ " marks: " + student.getMarks() + " average : " + avg);
		}
	}

	public void retrieveFirstLastNameConcat() {
		st.stream().map(s -> s.getFName() + s.getLName())
				.forEach(s -> System.out.println("Concatenated names: " + s + s.length()));
	}

	public void filterListOfStrings() {
		// if length of string is even make it capital
		st.stream().map(s -> s.getFName() + s.getLName()).forEach(s -> {
			if (s.length() % 2 == 0)
				System.out.println(s.toUpperCase());
			else
				System.out.println(s);
		});

	}
	
	public void oneFunction(){
		//st.parallelStream().filter((s -> s.getMarks().stream().map(Student::getMarks)))
	//	st.stream().filter(s -> System.out.println( s.getMarks().));
	}
	
}
