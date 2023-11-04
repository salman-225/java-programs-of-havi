package exception_handling;

public class CustomExceptionUsuage {
	public static void defineAge(int age) throws CustomException{
		if (age<18) {
			throw new CustomException("not allowed to vote0");
			
		}
		else
		{
			System.out.println("eligible for vote");
		}
		
		
	}
	public static void main(String[] args) {
		try {
			defineAge(1);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		}
	}

