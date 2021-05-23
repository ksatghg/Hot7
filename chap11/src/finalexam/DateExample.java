package finalexam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 ss초");
		String strnow = sdf.format(now);
		
		System.out.println(strnow);
		

	}

}
