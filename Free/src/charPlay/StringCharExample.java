package charPlay;

import java.util.Arrays;
import java.util.Scanner;

public class StringCharExample  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] b = new int[14];
		int c = 0;
		
				
		
			for(int i =0; i<14; i++) {
		
				b[i] = Integer.parseInt(scanner.nextLine());
				
				
					
				}
			
	
		
		
		for(int i = 0; i<14; i++) {
			
			System.out.print(b[i]);
			}
		String d = Arrays.toString(b);
		
		char sex = d.charAt(7);
		if (sex==1 | sex==3) {
			System.out.println("남자 입니다.");
			} else {
			System.out.println("여자 입니다."); 
		}
	}
}
