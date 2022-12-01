package section34;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendarDemo {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
	//	Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
