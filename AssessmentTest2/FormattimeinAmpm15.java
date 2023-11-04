package AssessmentTest2;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
public class FormattimeinAmpm15 {
	
	    public static void main(String[] args)
	    {	
	    	
	    	DateFormat dateFormat = new SimpleDateFormat("hh.mm. aa");
	    	String dateString = dateFormat.format(new Date()).toString();
	    	System.out.println("Current time in AM/PM: "+dateString);
	    	
	    	
	     }
	 
	    }
	


