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
			str = "������";
			break;
		case Calendar.TUESDAY:
			str = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			str = "������";
			break;
		case Calendar.THURSDAY:
			str = "�����";
			break;
		case Calendar.FRIDAY:
			str = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			str = "�����";
			break;
		case Calendar.SUNDAY:
			str = "�Ͽ���";
			break;
			
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";			
		} else {
			strAmPm = "����";
		}
		
		System.out.println(strAmPm);
		System.out.println(str);
		System.out.println(year + "��");
		System.out.println(month);
		System.out.println(day);
		
	}

}
