package com.xworkz.java.collection.sets;

public class Student implements Comparable<Student> {
   int id;
   String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
@Override
public int compareTo(Student student) {
	if(this.id< student.id) {
	
	return -1	;
} 
else if(this.id>student.id) {
	return +1;
	
	}
else {
	return 0;
   
}
}
}