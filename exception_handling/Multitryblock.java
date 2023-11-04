package exception_handling;

public class Multitryblock {
	public static void main(String[] args) {
       int a=10;
       int b=8;
       int[] num= new int [3];
			
				try {
					int c=a/b;
				   
					try {
						num[20]=30;
					}
					catch (ArrayIndexOutOfBoundsException f)
					{
						System.out.println(f);
					}
					 catch ( ArithmeticException e)
				    {
					System.out.println(e);
				    }
				}
				finally{
					System.out.println("the end");
				}
			
			
	
	}

}
