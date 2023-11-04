package Assingnment;

import java.util.Scanner;

public class SecondWordtoString
{
	public static void main(String[] args) 
	{
	

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=scan.nextLine();
	String[] stringArray =s.split(" ");
	try {
	if(stringArray[1]!=null)
	{
		
		System.out.println(stringArray[1].toUpperCase() );
	} 
	}
	catch(Exception e)
	
	{
	
		System.out.println("Less");
	}
	
}
}
