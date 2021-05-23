package sec01.exam28;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		
		System.out.println(strNow);
		

	}

}
