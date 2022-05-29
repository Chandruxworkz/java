class NestedifDemo{
public static void main (String...args){
	int a=5;
	if(a<=10)// true,outer if executed completely then control get inside
	{
		System.out.println("Inside outer if");
		if(a==5)        //inner if
		{
			System.out.println("a is equal to 5");
			}
			else       // inner else
			{
				System.out.println("a is not equal to 5");
			}
	}
	else  //then outer else will get ignored
	{
	
	System.out.println("a is greater than 5");

	}
	
}
}
