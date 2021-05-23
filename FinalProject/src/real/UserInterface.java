package real;

import java.util.*;


public class UserInterface {
	
	private Scanner scanner = new Scanner(System.in);
	FileCreate create = new FileCreate();
	UpdateClass update = new UpdateClass();
	
	private boolean run = true;
	
	public void showMenu() throws Exception {
		System.out.println();
		System.out.println("숫자를 입력해 주세요. 6번을 누르시면 서비스가 종료됩니다.");
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.목록보기 | 2.상세보기 | 3.추가하기 | 4.삭제하기 | 5.파일저장 | 6.종료");
			System.out.println("----------------------------------------------------------------");
			
			System.out.print("선택: ");
			String selectNo = scanner.nextLine();
			
			switch(selectNo) {
			case "1": System.out.print("1번을 선택하셨습니다."+"\n"+"\n");
					showAccount(); break;
			case "2": System.out.print("2번을 선택하셨습니다."+"\n"+"\n");
					showDetail(); break;
			case "3": System.out.print("3번을 선택하셨습니다."+"\n"+"\n");
					update.update(); break;
			case "4": System.out.println("4번을 선택하셨습니다."+"\n"+"\n");
					System.out.println("목록 삭제를 원하시면 1번, 초기화를 원하시면 2번을 눌러주세요.");
					update.delete(); break;
			case "5": try {
					create.saveFile();
				} catch (Exception e) {
					
				} break;
			case "6": run=false;
			}
		}
		System.out.println("서비스를 종료합니다.");
	}
			public void showAccount() {
			
			
			for(Account all : update.list) {
				System.out.println(all.getAno()+")" + "  " + "제품명:"+all.getName());
		}
			
			
			}
			public void showDetail() {
				for(Account all : update.list) {
			System.out.println(all.getAno()+") " +"제품명: "+all.getName() + "\t" +
					"가격: "+all.getPrice() + "\t" + "재고: "+all.getStock() + "\t" +
					"추천수: "+all.getPopular());		
			}
			}
		
	
	
}
