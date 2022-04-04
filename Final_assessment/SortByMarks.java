package com.finalassessment.one;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o2.marks-o1.marks);
	}

}
