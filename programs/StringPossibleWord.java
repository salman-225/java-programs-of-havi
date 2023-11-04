package programs;

import java.util.Scanner;

public class StringPossibleWord 
{
	public static void main(String[] args) {
		String s="p_t";
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=sc.nextInt();
	String [] s1=new String[size];
	System.out.println("Enter the ArrayElements");
	for(int i=0;i<size;i++)
	{
		s1[i]=sc.next();
	}
		int n=s.length();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].length()==n)
			{
				if(s1[i].charAt(0)=='p'&& (s1[i].charAt(s1[i].length()-1)=='t')) 
				{
					System.out.println(s1[i]+"   is possible word");
			     }
			else 
			{
				System.out.println(s1[i]+"is not possible word");
			}
		}
		
	}

}
}
