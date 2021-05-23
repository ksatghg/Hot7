package sec01.exam29;

import java.util.Calendar;

public class CalanderExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String str = null;
		System.out.println(Calendar.MONDAY);
		switch(week) {
		case Calendar.MONDAY:
			str = "월요일";
			break;
		case Calendar.TUESDAY:
			str = "화요일";
			break;
		case Calendar.WEDNESDAY:
			str = "수요일";
			break;
		case Calendar.THURSDAY:
			str = "목요일";
			break;
		case Calendar.FRIDAY:
			str = "금요일";
			break;
		case Calendar.SATURDAY:
			str = "토요일";
			break;
		case Calendar.SUNDAY:
			str = "일요일";
			break;
			
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";			
		} else {
			strAmPm = "오후";
		}
		
		System.out.println(strAmPm);
		System.out.println(str);
		System.out.println(year + "년");
		System.out.println(month);
		System.out.println(day);
		
	}

}
