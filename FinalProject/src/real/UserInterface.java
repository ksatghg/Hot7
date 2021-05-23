package real;

import java.util.*;


public class UserInterface {
	
	private Scanner scanner = new Scanner(System.in);
	FileCreate create = new FileCreate();
	UpdateClass update = new UpdateClass();
	
	private boolean run = true;
	
	public void showMenu() throws Exception {
		System.out.println();
		System.out.println("���ڸ� �Է��� �ּ���. 6���� �����ø� ���񽺰� ����˴ϴ�.");
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.��Ϻ��� | 2.�󼼺��� | 3.�߰��ϱ� | 4.�����ϱ� | 5.�������� | 6.����");
			System.out.println("----------------------------------------------------------------");
			
			System.out.print("����: ");
			String selectNo = scanner.nextLine();
			
			switch(selectNo) {
			case "1": System.out.print("1���� �����ϼ̽��ϴ�."+"\n"+"\n");
					showAccount(); break;
			case "2": System.out.print("2���� �����ϼ̽��ϴ�."+"\n"+"\n");
					showDetail(); break;
			case "3": System.out.print("3���� �����ϼ̽��ϴ�."+"\n"+"\n");
					update.update(); break;
			case "4": System.out.println("4���� �����ϼ̽��ϴ�."+"\n"+"\n");
					System.out.println("��� ������ ���Ͻø� 1��, �ʱ�ȭ�� ���Ͻø� 2���� �����ּ���.");
					update.delete(); break;
			case "5": try {
					create.saveFile();
				} catch (Exception e) {
					
				} break;
			case "6": run=false;
			}
		}
		System.out.println("���񽺸� �����մϴ�.");
	}
			public void showAccount() {
			
			
			for(Account all : update.list) {
				System.out.println(all.getAno()+")" + "  " + "��ǰ��:"+all.getName());
		}
			
			
			}
			public void showDetail() {
				for(Account all : update.list) {
			System.out.println(all.getAno()+") " +"��ǰ��: "+all.getName() + "\t" +
					"����: "+all.getPrice() + "\t" + "���: "+all.getStock() + "\t" +
					"��õ��: "+all.getPopular());		
			}
			}
		
	
	
}
