package ro.erni.java.training.object.execution.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import ro.erni.java.training.object.execution.StudentSort;
import ro.erni.java.training.ojects.Student;

public class StudentSortTest {

	//List<Student> strings2 = Arrays.asList(new Student("Ana", "Grigorescu"), new Student("Dan", "Ionescu"), new Student("Diana", "Dan") ,new Student("George", "Pop"),new Student("Ioana", "Pop"));
	
	@Test
	public void sortByFNameForListOfStudentsTest() {
	//	List<Student> strings2 = Arrays.asList(new Student("Ana", "Grigorescu"), new Student("Dan", "Ionescu"), new Student("Diana", "Dan") ,new Student("George", "Pop"),new Student("Ioana", "Pop"));
		StudentSort stud = new StudentSort();
		stud.initialize();
		//assertEquals(strings2 , stud.sortByFname());
	}

	@Test
	public void sortChronologicallyForListOfStudentsTest() {
		StudentSort stud = new StudentSort();
		stud.initialize();
		//assertEquals();
	}
}
