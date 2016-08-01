package ro.erni.java.training.object.execution;

public class MainApp {

	public static void main(String[] args) {
		StudentSort init = new StudentSort();
		StudentSort print = new StudentSort();

		init.initialize();
		//print.displaysortByFname();
		//print.sortByLname();
		//print.sortChronologically();
		//print.sortAvgMark();
		//print.birthdayOn1991();
		//print.studentLastNameFilterByLetter("c");
		//print.groupStudentsByCategory();
		//print.retrieveMarksComputeAvg();
		//print.retrieveFirstLastNameConcat();
		print.filterListOfStrings();
	}

}
