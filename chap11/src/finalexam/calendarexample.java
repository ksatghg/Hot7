package finalexam;

import java.util.Calendar;

public class calendarexample {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH)+1;
		String strMonth = (month<10)? ("0"+month) : (""+month);
		
		System.out.println(strMonth);
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
	}

}
