class Studentdetails{
String usn;
String name;
String age;
String dob;
void details(){
System.out.println(" usn:- " + usn);
System.out.println(" name:-" + name);
System.out.println(" age:-" + age);
System.out.println(" dob:-" + dob);

}
}
class Details{
	public static void main(String[]args){
		Studentdetails details1 = new Studentdetails();
		System.out.println("Student 1");
		details1.usn = "2lb17cv006";
		details1.name = "Chandrashekhar";
		details1.age = "22";
		details1.dob = "06/10/1999";
		details1.details();
		
		Studentdetails details2 = new Studentdetails();
		System.out.println("Student 2");
		details2.usn = "2lb17cv014";
		details2.name = "Nandesh";
		details2.age = "22";
		details2.dob = "26/9/2000";
		details2.details();
		
	}
}