package Assessment12_01_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FullTimeEmployee {
	public String name;
	public static int  id;
	public int age;
	public static String date ;
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String dateofbirth;
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", age=" + age + ", date=" + date + ", dateofbirth="
				+ dateofbirth + "]";
	}
	
	public static void main(String[] args) {
			
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number of data you want to enter");
	int num= scan.nextInt();
	FullTimeEmployee  emp=new FullTimeEmployee();
	HashMap<Integer, String> hm= new HashMap<>(num);
	for(int i=1;i<=num; i++)
	{
		System.out.println("Enter the name of employee");
		emp.name= scan.next();
		System.out.println("Enter the id of employee");
		emp.id= scan.nextInt();
		System.out.println("Enter the age of employee");
		emp.age= scan.nextInt();
		System.out.println("Enter the date of joining of  the  employee");
		emp.date= scan.next();
		emp.setDate(date);
		System.out.println("Enter the  date of birth of  the employee");
		emp.dateofbirth= scan.next();
		
		hm.put(id,emp.toString());
			
		
	}
	
	
	System.out.println(hm);
	ArrayList<Map.Entry<Integer,String> >list= new ArrayList<>(hm.entrySet());
	}

}
class Mycomparator implements Comparator<Map.Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getdate() compareTo(o2.getValue().getdate);
	}
	
	
	
	
}

