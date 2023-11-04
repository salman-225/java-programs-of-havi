package Assingnment;

import java.util.Arrays;
import java.util.Scanner;

public class IdGenerating {
	public static void main(String[] args)
	{
		System.out.println("Enter the Firstname,LastName and pin and num in detailsRequiredForPinMethod");
		detailsRequiredForPin("RAJhgggg","DON",15244999,3);
	}
	public  static String sname;
	public   static String lname;
	public static void detailsRequiredForPin(String FirstName,String LastName,int pin,int num)
	{
	    int n=FirstName.length();
	    int n1=LastName.length();
	    String value=" ";
	    String id=" ";
	    if(n>n1)
	    {
	    	lname=FirstName;
	    	sname=LastName;
	    }
	    else if(n<n1)
	    {
	    	lname=LastName;
	    	sname=FirstName;  	
	    }
	    else if(n==n1)
	    {
	    	String [] s=new String[2];//USED STRING  FOR SORTING
	    	s[0]=FirstName;
	    	s[1]=LastName;
	    	Arrays.sort(s);
	    	sname=s[0];
	    	lname=s[1];
	    }  
	    String[] nu=new String [3];//nu to fetch for digits independently
	    nu[0]=Integer.toString(pin);
	    nu[1]=Integer.toString(num);
	    int [ ] mu=new int[2];
	    mu[1]=num;//num to apply condition
	    if(mu[1]<nu[0].length()&& mu[1]>=0 & mu[1]<=9) 
	    {
	    	char number=nu[0].charAt(num-1);
	    	char ni=nu[0].charAt(nu[0].length()-num);
	    	String j=Character.toString(number);//to convert char to String
	     value= j+ni;//concatination happends here
	    }
	    else
	    {
	    	System.out.println("Enter the number single digit from 0 to "+nu[0].length());
	    }
	    id=sname.charAt(sname.length()-1)+lname+value;
	    StringBuffer sb= new StringBuffer(" ");// STRING BUFFER
       for (int g=0;g<id.length();g++)
        {
    	   if(Character.isUpperCase(id.charAt(g)))
    	   {
    		   char ch= id.charAt(g);
    	      Character.toLowerCase(ch);
    	      sb.append( Character.toLowerCase(ch));
    		   
    	  }
    	   else if(Character.isLowerCase(id.charAt(g)))
    	   {
    		   char ch=id.charAt(g);
    		   Character.toUpperCase(ch);
    		   sb.append(Character.toUpperCase(ch));
    		   
    	   }
    	   else if (Character.isDigit(id.charAt(g)))
    	   { 
    		   char ch=id.charAt(g);
    		   sb.append(ch);
    	   }   
        }
             System.out.println(sb);
        }
	
}
