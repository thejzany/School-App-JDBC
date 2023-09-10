package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	public Student saveStudent(Student student) {
		Student s = studentDao.saveStudent(student);
		return s;
	}

	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}

	public Student getStudentById(Student student) {
		return studentDao.getStudentById(student);
	}

	public Student getAllStudent(Student student) {
		return studentDao.getAllStudent(student);
	}

	public Student updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	public boolean updateStudentEmailById(int id, String email) {
		return studentDao.updateStudentEmailById(id, email);
	}

	public boolean updateStudentNameById(int id, String name) {
		return studentDao.updateStudentNameById(id, name);
	}
}
