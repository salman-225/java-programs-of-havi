package AssessmentTest2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.println("Enter number of student you want to enter");
		int size= scan.nextInt();
		String[][] data= new String[size][3];
		
		while (true) {
			System.out.println("Select the options below");
			System.out.println("Enter the option 1 for inserting the  Student data");
			System.out.println("Enter the option 2 for fetch the Student data");
			System.out.println("Enter the option 3 for display all the Student data");
			int num = scan.nextInt();
			switch (num) {
			case 1: {
				
				for(int i=0; i<=size-1;i++) {
				count++;
				System.out.println("Enter the Student Id : ");
				data[i][0]=scan.next();
				System.out.println("Enter the Student First Name: ");
				data[i][1]=scan.next();
				System.out.println("Enter the Student Last Name: ");
				data[i][2]=scan.next();
			
				}
				break;
			
			}
			case 2: {
				System.out.println("Enter the id :");
				String num1=scan.next();
				for(int j=0;j<=size-1;j++) {
					if(data[j][0].equals(num1)) {
						System.out.println("Student id : "+data[j][0]);
						System.out.println("Student First Name : "+data[j][1]);
						System.out.println( "Student Last Name : "+data[j][2]);
					}
					
				}
				break;
			}
			case 3: {
				System.out.println("The  list of Students information is given below");
				for(int y=0;y<=size-1  ;y++)
				{
					
			System.out.println("Student id : "+ data[y][0]);					  
			System.out.println("Student First Name : "+data[y][1]);
		    System.out.println("Student First Name : "+ data[y][2]);
		    System.out.println();
							
				}
				break;
			}
			default:{
				System.out.println("Enter the valid options");
			}
			}

		}
	}

}

