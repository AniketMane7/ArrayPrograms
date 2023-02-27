package custom_exception;

public class TestCustomException2 {
	
	public static void main(String[] args)
	{

		try {
			
			throw new Example2();	
		} catch (Exception e) {
			
			System.out.println("Caught the Exception");
			System.out.println(e.getMessage());
			
		}
		System.out.println("Rest of the Code");
	}

}
