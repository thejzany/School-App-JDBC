package com.school.controller;

import com.school.service.StudentService;

public class StudentDeleteController {
	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		boolean res = studentService.deleteStudentById(5);
		System.out.println(res);
	}
}
