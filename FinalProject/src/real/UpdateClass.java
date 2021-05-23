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
		
		System.out.print("상품명: ");
		account.setName(scan.nextLine());
		
		System.out.print("가격: ");
		account.setPrice(Integer.parseInt(scan.nextLine()));
		
		System.out.print("재고: ");
		account.setStock(Integer.parseInt(scan.nextLine()));
		
		System.out.print("추천수: ");
		account.setPopular(Integer.parseInt(scan.nextLine()));
		
		list.add(account);
		
		} catch (Exception e) {
			System.out.println("등록 에러: " +e.getMessage());
		}
	}
	public void delete() throws Exception{
		int selectNo = Integer.parseInt(scan.nextLine());
		if(selectNo == 1) {
			System.out.println("원하시는 목록의 순번을 입력하세요");
			int i = Integer.parseInt(scan.nextLine());
			list.remove(i-1);
		} else {
			System.out.println("초기화를 원하시면 '네'를 입력해 주세요.");
			String select = scan.nextLine();
			if(select.equals("네")) {
				System.out.println("초기화합니다.");
				list.clear();
		}
		
		

			
	}
	
}
}