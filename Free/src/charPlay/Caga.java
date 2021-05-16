package charPlay;
import java.util.Scanner;

public class Caga {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;		
		String input;
		
		
		
		while(run) {
			input = scanner.nextLine();
			char charVal = input.charAt(0);
			int intVal = (int)charVal;
			System.out.println(intVal);
			
			
			
		 if(input.equals("q")) {
			run = false;
		}
		
		
		
	}
	}
	}
