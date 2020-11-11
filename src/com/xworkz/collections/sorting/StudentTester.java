package com.xworkz.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTester {
	public static void main(String[] args) {
		
		Student s1 = new Student(16, "Rohan", "J P nagar");
		Student s2 = new Student(16, "Rahul", "RR nagar");
		Student s3 = new Student(18, "Reka", "RajajiNagar");
		Student s4 = new Student(14, "Ruhi", "Jayanagar");
		
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		
		System.out.println(student);
		
		Comparator<Student>student1=(o1,o2)->o1.getName().compareTo(o2.getName());
		Comparator<Student>student2=(o1,o2)->o1.getAge()-o2.getAge();
		
		
		student.sort(student1);
		System.out.println(student);
		student.sort(student2);
		System.out.println(student);
		
		
		
		
		
		
		
		
	}
}
