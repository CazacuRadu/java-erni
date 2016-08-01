package ro.erni.java.training.object.execution;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import ro.erni.java.training.ojects.Student;

public interface StudentInitialization {

	List<Student> st = new ArrayList<>();
	Calendar cal = Calendar.getInstance();

	public default void initialize() {
		// cal.set(1852, 1, 2);
		// st.add(new Student("Dan", "Ionescu", cal.getTime(), 5));
		// cal.set(1991, 10, 14);
		// st.add(new Student("George", "Pop", cal.getTime(), 10));
		st.add(new Student("Ioana", "Cop", IsoChronology.INSTANCE.date(1987, 05, 20), 7, Arrays.asList(7, 5, 8)));
		st.add(new Student("Io", "Ca", IsoChronology.INSTANCE.date(1987, 05, 20), 7, Arrays.asList(7, 5, 8)));
		st.add(new Student("Ioana", "Floare", IsoChronology.INSTANCE.date(1997, 01, 10), 1, Arrays.asList(7, 7, 8, 4)));
		st.add(new Student("Diana", "Danescu", IsoChronology.INSTANCE.date(1990, 05, 20), 8,
				Arrays.asList(5, 5, 8, 9, 10)));
		st.add(new Student("Andu", "Croitoru", IsoChronology.INSTANCE.date(1990, 06, 10), 8,
				Arrays.asList(10, 6, 5, 8, 6)));
		st.add(new Student("Ana", "Grigorescu", IsoChronology.INSTANCE.date(1991, 05, 20), 1,
				Arrays.asList(6, 5, 8, 6, 4, 10)));
	}
}
