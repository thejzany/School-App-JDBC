package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentUpdateController {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("Jay");
		student.setEmail("jay@gmail.com");

		StudentService studentService = new StudentService();
		Student s = studentService.updateStudent(student);

		if (s != null) {
			System.out.println(s.getId() + " Updated Successfully");
		}

	}
}