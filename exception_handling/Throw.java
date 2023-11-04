package exception_handling;

public class Throw {
	public static int numberSquare(int i)
	{
		if(i<0)
		{
			throw new ArithmeticException("not Aligible for vote");
		}
		return i*i;
		
	}
	public static void main(String[] args) {
		System.out.println(numberSquare(-5));
		
	}

}
