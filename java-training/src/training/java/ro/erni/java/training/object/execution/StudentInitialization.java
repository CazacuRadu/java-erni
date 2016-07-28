package ro.erni.java.training.object.execution;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import ro.erni.java.training.ojects.Student;

public interface StudentInitialization {
	
	List<Student> st = new ArrayList<>();
	
	public default void initialize() {
		st.add(new Student("Dan", "Ionescu", IsoChronology.INSTANCE.date(1984, 05, 20), 5));
		st.add(new Student("George", "Pop", IsoChronology.INSTANCE.date(1991, 05, 20), 10));
		st.add(new Student("Ioana", "Pop", IsoChronology.INSTANCE.date(1987, 05, 20), 1));
		st.add(new Student("Diana", "Dan", IsoChronology.INSTANCE.date(1990, 05, 20), 8));
		st.add(new Student("Ana", "Grigorescu", IsoChronology.INSTANCE.date(1990, 05, 20), 1));
	}
}
