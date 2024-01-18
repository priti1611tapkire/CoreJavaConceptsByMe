package com.comparator;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		return stu1.getName().compareTo(stu2.getName());
	}

}
