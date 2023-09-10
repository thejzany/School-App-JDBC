package com.school.controller;

import com.school.service.StudentService;

public class StudentUpdateNameController {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		boolean res = ss.updateStudentNameById(1, "Jay");
		System.out.println(res);
	}
}