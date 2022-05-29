class Matrimony{
public static void main(String...args){
	char gender = 'Ms';
	int age=22;
	if(gender == 'M')
	{
		System.out.println("Gender is male");
		if(age>=21)
		{
		System.out.println("Yes,You can get married");
		
		}
		else
		{
			System.out.println("Have patience");
			
		}
	}
	else if(gender == 'F')
	{
		System.out.println("Gender is female");
		if(age>=18)
		{
			System.out.println("Yes,You can get married");
		}
		else
		{
		System.out.println("Have patience");
		}
		
	}
	else
	{
	System.out.println("Invalid");	
    }
}
}