package com.xworkz.java.array_as_dao.service;
import com.xworkz.java.array_as_dao.dto.StudentDTO;

public interface StudentService {
	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phNo);
	void updateStudent(StudentDTO dto);

}
