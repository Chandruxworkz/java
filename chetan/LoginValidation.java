class LoginValidation
{
public static void main(String...args)
{
String id="admin";
int password=123;
if(id!="admin")
	{
		System.out.println("User ID is valid");
		if(password==123)
		{
			
			System.out.println("Password is valid");
			System.out.println("Login Succesful");
		}
		else
		{
			System.out.println("Password is invalid");
			System.out.println("Login Unsuccesful");
		}
	}
		else
		{
			System.out.println("User ID is invalid");
			System.out.println("Login Unsuccessful");
		}
	
}
}