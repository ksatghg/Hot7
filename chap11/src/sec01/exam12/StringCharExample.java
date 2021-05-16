package sec01.exam12;

import java.util.Arrays;
import java.util.Scanner;

public class StringCharExample  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] b = null;
		int c = 0;
		boolean run = true;
				
		while(run) {
			
			System.out.print("선택> ");
			int select = Integer.parseInt(scanner.nextLine());
			if(select == 14) {
			b = new int[select]; 
			} else {
				break;
			}
			for(int i =0; i<14; i++) {
		
				b[i] = Integer.parseInt(scanner.nextLine());
				
				
					
				}
			
	break;
		}
		
		for(int i = 0; i<14; i++) {
			
			System.out.print(b);
			}
		String d = Arrays.toString(b);
		System.out.println(d);
		char sex = d.charAt(7);
		System.out.println(sex);
		if (sex == '1') {
			System.out.println("남자 입니다.");
			} else {
			System.out.println("여자 입니다."); 
		}
	}
}
