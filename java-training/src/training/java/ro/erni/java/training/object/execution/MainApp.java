package ro.erni.java.training.object.execution;

public class MainApp {

	public static void main(String[] args) {
		StudentSort init = new StudentSort();
		StudentSort print = new StudentSort();

		init.initialize();
		
		print.printAll();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.displaysortByFname();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.sortByLname();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.sortChronologically();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.sortAvgMark();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.sortAvgMarkFilterMark(10.0);
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.birthdayOnYear(1991);
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.studentLastNameFilterByLetter("c");
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.groupStudentsByCategory();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.retrieveMarksComputeAvg();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.retrieveFirstLastNameConcat();
		System.out.println("\n\n Spatiu dramatic..\n\n");
		print.filterListOfStrings();
	}

}
