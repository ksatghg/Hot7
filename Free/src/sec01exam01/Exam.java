package sec01exam01;

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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.print("����> ");
			int select = Integer.parseInt(scanner.nextLine());
			
			if(select == 1 ) {
				System.out.print("�л���> ");
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
				System.out.println("�ְ� ����: "+ max);
				System.out.println("��� ����: "+ avg);
			} else if(select == 5) {
				run = false;
				
		} else {
			System.out.println("1,2,3,4,5�� �� �ϳ��� �Է��� �ּ���");
		}
		} catch (NumberFormatException e) {
			System.out.println("�л����� ���� �Է��� �ּ���.");
		}  catch (NullPointerException e) {
			System.out.println("�л����� ���� �Է��� �ּ���");
		}
		
			}
		scanner.close();
		System.out.println("���α׷� ����");
	
		}
}
	
//NullPointerException
//NumberFormatException