package section34;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		
// current date.... current time
		Date d = new Date();
		System.out.println(d.toString());
		
		
// date in paricular formate
	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println(sdf.format(d));
		
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy");
		System.out.println(dateFormat.format(d));
	
	
	
	}

}
