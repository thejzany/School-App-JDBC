package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	int i = 0;
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// to update student data
	public Student updateStudent(Student student) {

		connection = helperClass.getConnection();
		String sql = "UPDATE student SET name =?  ,mail=? WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			;
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3, student.getId());

			int a = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return student;
	}

	// to update student email by id
	public boolean updateStudentEmailById(int id, String email) {
		connection = helperClass.getConnection();
		String sql = "UPDATE student SET mail=? WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);

			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// to update student name by id
	public boolean updateStudentNameById(int id, String name) {
		connection = helperClass.getConnection();
		String sql = "UPDATE student SET name=? WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);

			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// to get-all student data
	public Student getAllStudent(Student student) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM student";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getString(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;

	}

	// to get a student data by id
	public Student getStudentById(Student student) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM student WHERE id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, student.getId());

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getString(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;

	}

	// to delete a student data
	public boolean deleteStudentById(int id) {
		int a = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM student WHERE ID=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			a = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (a > 0) {
			return true;
		} else {
			return false;
		}
	}

	// to save a student data
	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";

		try {
			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values to delimiters/place-holders--->?
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());

			// execute statement
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
}
