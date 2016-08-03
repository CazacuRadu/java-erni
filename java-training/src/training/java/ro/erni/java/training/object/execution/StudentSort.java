package ro.erni.java.training.object.execution;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ro.erni.java.training.ojects.Student;

public class StudentSort implements StudentInitialization {

	// print the list of Students
	public void printAll() {
		st.forEach(s -> System.out.println(
				s.getFName() + " " + s.getLName() + " " + s.getBirthday() + " " + s.getAvg() + " " + s.getMarks()));
	}

	// sort alphabetically by First Name
	public void displaysortByFname() {
		System.out.println("Sorted by First Name:\n ");
		st.sort((s1, s2) -> s1.getFName().compareTo(s2.getFName()));
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName()));
	}

	// sort alphabetically by Last Name
	public void sortByLname() {
		System.out.println("Sorted by Last Name:\n");
		st.sort((s1, s2) -> s1.getLName().compareTo(s2.getLName()));
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName()));

	}

	// sort chronologically
	public void sortChronologically() {
		System.out.println("Sorted by Date of Birth:\n");
		st.sort((s1, s2) -> s1.getBirthday().compareTo(s2.getBirthday()));
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getBirthday()));

	}

	// sort by average mark
	public void sortAvgMark() {
		System.out.println("Sorted by Average Mark:\n");
		st.sort((s1, s2) -> Double.compare(s1.getAvg(), s2.getAvg()));
		Collections.reverse(st);
		st.forEach(s -> System.out.println(s.getFName() + " " + s.getLName() + " " + s.getAvg()));

	}

	public void sortAvgMarkFilterMark(Double mark) {
		st.stream().filter(s -> s.getAvg() == mark)
				.forEach(s -> System.out.println("Sorted by Average Mark filtered by the mark: " + mark + "\n" + s.getFName() + " " + s.getLName() + " " + s.getAvg()));
	}

	public void birthdayOnYear(int year) {
		st.stream().filter(s -> s.getBirthday().getYear() == year)
				.forEach(s -> System.out.println("Sorted by Year filtered by the year: " + year + "\n" + s.getFName() + " " + s.getLName() + " " + s.getBirthday()));
	}

	public void studentLastNameFilterByLetter(String letter) {
		boolean anyMatch = st.stream().findAny().get().getLName().startsWith(letter.toUpperCase());
		List<Student> fil = st.stream().filter(s -> s.getLName().contains(letter)).collect(Collectors.toList());
		//fil.forEach(s -> System.out.println(s));
		System.out.println("Number of students with letter c in them is : " + fil.size());
		System.out.println("There are students whose name start with : " + letter.toUpperCase() + " this statement is " + anyMatch);

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
		st.stream().map(s -> s.getFName() + s.getLName()).forEach(s -> System.out.println("The concatenated names: " + s));
	}

	public void filterListOfStrings() {
		// if length of string is even make it capital
		st.stream().map(s -> s.getFName() + s.getLName()).forEach(s -> {
			if (s.length() % 2 == 0) {
				System.out.println("The string has an even number of characters so we make it UpperCase: " + s.toUpperCase());
			} else
				System.out.println("The string has an odd number of characters so we leave it LowerCase: " + s);
		});

	}

	public void oneFunction() {
		// st.parallelStream().filter((s ->
		// s.getMarks().stream().map(Student::getMarks)))
		// st.stream().filter(s -> System.out.println( s.getMarks().));
	}

}
