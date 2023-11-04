package AssessmentTest;

import java.util.Scanner;

public class CompondIntereseto6 {
	public static double compondInterest(double amt,double rate,double year)
	{
		double res=(1+( rate/100));
		double exp=1;
		for(int i=1; i<=year;i++)//p*(1+r/100) compond interest
		{
			exp=res*exp;
		}
		double finalresult= amt*exp;
		return finalresult-amt;		
	}
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the principle amount");
	double prin=scan.nextDouble();
	System.out.println("Enter the rate of interest");
	double rate= scan.nextDouble();
	System.out.println("Enter no of years");
	double year=scan.nextDouble();
	System.out.println(compondInterest(prin,rate,year));
	}
}
