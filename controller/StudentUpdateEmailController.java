package com.school.controller;

import com.school.service.StudentService;

public class StudentUpdateEmailController {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		boolean res = ss.updateStudentEmailById(1, "jay@gmail.com");
		System.out.println(res);
	}
}