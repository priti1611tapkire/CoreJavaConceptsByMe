package com.thirdday25_11_2020;

import java.util.ArrayList;
import java.util.List;

public class College {
	public List<Student_2> allStudentData() {
		List<Student_2> list=new ArrayList<Student_2>();
		Student_2 s3=new Student_2();
		s3.setRollno(56);
		s3.setName("Mahseh");
		s3.setAddr("Karvenagar");
		
		Student_2 s2=new Student_2();
		s2.setRollno(96);
		s2.setName("Suyash");
		s2.setAddr("pimpri");
		
		//list.add(s3);
		list.add(s2);
		
		return list;
	}

}
