package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentSaveController {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Jay");
		student.setEmail("jay@mail.com");

		StudentService studentService = new StudentService();
		Student s = studentService.saveStudent(student);

		if (s != null) {
			System.out.println(s.getId() + " Saved Successfully");
		}
	}
}
