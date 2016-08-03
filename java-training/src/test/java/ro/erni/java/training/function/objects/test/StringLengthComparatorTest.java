package ro.erni.java.training.function.objects.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.erni.java.training.function.objects.StringLengthComparator;

public class StringLengthComparatorTest {

	private StringLengthComparator str = new StringLengthComparator();
	
	@Test
	public void stringLengthComparatorForNewObjectStringLengthComparatorTest() {
		assertEquals("Expected 3: string length abcd - a = 3",  3 , str.compare("abcd", "a"));
	}

}
