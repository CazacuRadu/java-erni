package ro.erni.java.training.object.execution;

public class MainApp {

	public static void main(String[] args) {
		StudentSort init = new StudentSort();
		StudentSort print = new StudentSort();
		StudentSort print1 = new StudentSort();
		StudentSort print2 = new StudentSort();
		StudentSort print3 = new StudentSort();
		StudentSort print4 = new StudentSort();

		init.initialize();
		print.displaysortByFname();
		print1.sortByLname();
		print2.sortChronologically();
		print3.sortAvgMark();
		print4.birthdayOn1991();
	}

}
