package finalexam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� ss��");
		String strnow = sdf.format(now);
		
		System.out.println(strnow);
		

	}

}
