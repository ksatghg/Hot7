package real;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateClass implements Serializable{
	List<Account> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	private int counter;
	public void update() {
		try {
		Account account = new Account();
		account.setAno(++counter);
		
		System.out.print("��ǰ��: ");
		account.setName(scan.nextLine());
		
		System.out.print("����: ");
		account.setPrice(Integer.parseInt(scan.nextLine()));
		
		System.out.print("���: ");
		account.setStock(Integer.parseInt(scan.nextLine()));
		
		System.out.print("��õ��: ");
		account.setPopular(Integer.parseInt(scan.nextLine()));
		
		list.add(account);
		
		} catch (Exception e) {
			System.out.println("��� ����: " +e.getMessage());
		}
	}
	public void delete() throws Exception{
		int selectNo = Integer.parseInt(scan.nextLine());
		if(selectNo == 1) {
			System.out.println("���Ͻô� ����� ������ �Է��ϼ���");
			int i = Integer.parseInt(scan.nextLine());
			list.remove(i-1);
		} else {
			System.out.println("�ʱ�ȭ�� ���Ͻø� '��'�� �Է��� �ּ���.");
			String select = scan.nextLine();
			if(select.equals("��")) {
				System.out.println("�ʱ�ȭ�մϴ�.");
				list.clear();
		}
		
		

			
	}
	
}
}