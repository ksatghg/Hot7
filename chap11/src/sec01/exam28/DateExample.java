package sec01.exam28;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� hh�� mm�� ss��");
		String strNow = sdf.format(now);
		
		System.out.println(strNow);
		

	}

}
