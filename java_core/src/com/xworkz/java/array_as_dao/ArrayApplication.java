package com.xworkz.java.array_as_dao;

import com.xworkz.java.array_as_dao.dto.StudentDTO;
import com.xworkz.java.array_as_dao.service.StudentService;
import com.xworkz.java.array_as_dao.service.StudentServiceImpl;

public class ArrayApplication {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("1", "Darshan", "BTM01", 9108628804l, "70%");
		StudentService service = new StudentServiceImpl();
		service.addStudent(dto);
		StudentDTO  student = service.getStudent(9108628804l);
		
		System.out.println("Student Detail :");
		System.out.println(student);
	}

}
