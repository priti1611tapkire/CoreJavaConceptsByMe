package com.comparator;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		return stu1.getRollno()-stu2.getRollno();
	}

}
