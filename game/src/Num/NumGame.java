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
		
			
			System.out.println("�Է��� ���ں��� Ů�ϴ�.");
			
		} else if(val < num) {
			
			System.out.println("�Է��� ���ں��� �۽��ϴ�.");
			
		} else {
			System.out.println("�����մϴ�. �����Դϴ�.");
			break;
			
		}
		
		}
		
	}
	
}
