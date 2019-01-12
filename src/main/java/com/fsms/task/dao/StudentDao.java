package com.fsms.task.dao;

import java.util.List;

import com.fsms.task.model.Student;

public interface StudentDao {

	Student findById(int id);

	void saveStudent(Student student);
	
	public void saveOrUpdate(Student student);
	
	void deleteStudentByCode(String ssn);
	
	List<Student> findAllStudents();

	Student findStudentByCode(String ssn);

}
