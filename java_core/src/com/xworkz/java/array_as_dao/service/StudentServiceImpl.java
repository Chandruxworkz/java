package com.xworkz.java.array_as_dao.service;
import com.xworkz.java.array_as_dao.dao.StudentDAO;
import com.xworkz.java.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.java.array_as_dao.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void addStudent(StudentDTO dto) {
		long number = dto.getPhNo();
		int length = 0;
		int revnum = 0;
		while(number>0) {
			number = number/10;
			length++;
	}
		if(dto.getPhNo() ==10) {
			studentDAO.addStudent(dto);
			System.out.println("number is valid");
		}
		else {
			System.out.println("Invalid Phone number");
		}
	}

	@Override
	public StudentDTO getStudent(long phNo) {
				return studentDAO.getStudent(phNo);
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		
		
	}
	
	
	

}
