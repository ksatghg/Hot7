package reference;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] student = null;
		int studentNo = 0;
		boolean run = true;
	
		
		while(run) {
			try {
				
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int select = Integer.parseInt(scanner.nextLine());
			
			if(select == 1 ) {
				System.out.print("학생수> ");
				studentNo = Integer.parseInt(scanner.nextLine());
				student = new int[studentNo];	
			}
			
			
				else if(select == 2) {
				for(int i = 0; i<student.length; i++) {
					System.out.print("score["+i+"]> ");
					student[i] = Integer.parseInt(scanner.nextLine());
				}
			
			} else if(select ==3) {
				for(int i = 0; i<student.length; i++) {
					System.out.println("score["+i+"]> " + student[i]);
			}
			}else if(select ==4) {
				int sum = 0;
				int max = 0;
				double avg = 0;
				for(int i =0; i<student.length; i++) {
					sum +=student[i];
					avg = (double) sum / studentNo;
					if(student[i]>max) {
						max = student[i];
					}
				}
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ avg);
			} else if(select == 5) {
				run = false;
				
		} else {
			System.out.println("1,2,3,4,5번 중 하나를 입력해 주세요");
		}
		} catch (NumberFormatException e) {
			System.out.println("학생수를 먼저 입력해 주세요.");
		}  catch (NullPointerException e) {
			System.out.println("학생수를 먼저 입력해 주세요");
		}
		
			}
		scanner.close();
		System.out.println("프로그램 종료");
	
		}
}
	
//NullPointerException
//NumberFormatException