package custom_exception;

public class TestCustomException1 {

	// method to check age 
	
	static void validate(int age) throws Example1
	{
		if (age < 18)
		{
			// throw an object of user defined exception  
			throw new Example1("age is not valid");
		}
		else
		{
			System.out.println("Welcome To Voating");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(22);
			
		} catch (Exception e) {
         
			System.out.println("Caught The Exception");
			System.out.println("Exception Occured : " + e );
		}
		
System.out.println("rest of code ");
	}

}
