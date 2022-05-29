class IfelseifDemo{
	public static void main(String...args){
		int marks = 75;
		if(marks>=81 && marks<=100){
			System.out.println("Distinction");
		}
		else if(marks>=35 && marks<=80){
			System.out.println("First class");
		}
	else if(marks>=0 && marks<=34){
			System.out.println("Fail.Study well...!");
}
		else{
			System.out.println("Invalid marks");// optional
			
		}
			
	}
}