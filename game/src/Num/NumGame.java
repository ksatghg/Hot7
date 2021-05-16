package Num;

import java.util.Scanner;

public class NumGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		int num = (int) (Math.random()*100) + 1;
				
		for(int i=1; i<=100; i++) {
			String input = scanner.nextLine();
			int val = Integer.parseInt(input);
			if(val > num ) {
		
			
			System.out.println("입력한 숫자보다 큽니다.");
			
		} else if(val < num) {
			
			System.out.println("입력한 숫자보다 작습니다.");
			
		} else {
			System.out.println("축하합니다. 정답입니다.");
			break;
			
		}
		
		}
		
	}
	
}
