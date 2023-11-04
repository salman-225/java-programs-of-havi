package AssessmentTest2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class EstFormatTime16 {
	public static void main(String[] args) {
		Date g= new Date();
		DateFormat q = new SimpleDateFormat("hh.mm.ss");
    	q.setTimeZone(TimeZone.getTimeZone("Est"));	
    	System.out.println(q.format(g));
	}

}
