package toyCloneBlackJack;

import java.util.Scanner;

public class Blackjack {
	
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	
	Deck playingDeck = new Deck();
	
	Deck playerDeck = new Deck();
	Deck dealerDeck = new Deck();
	
	playingDeck.createDeck();
	playingDeck.shuffleDeck();
	
	System.out.println("�����Ѵ�");
	Double money = 200.00;
	
	while(true) {
		System.out.println("�� ����� "+money+"���̴�. ���ɾ��");
		Double bet = scan.nextDouble();
		System.out.println("�� "+bet+"�� �ɾ���.");
		if((money>=bet)&&(bet>=0)) {
		money -= bet;
		if(money<=0) {
			System.out.println("����");
		break;	
		}
		
		//���徿 ��ο�
		playerDeck.draw(playingDeck);
		Card a = playerDeck.getCard(0);
		dealerDeck.draw(playingDeck);
		Card b = dealerDeck.getCard(0);
		
		
		//�Ⱥ��̴°� ��ο�
		playerDeck.draw(playingDeck);
		Deck c = playerDeck;
		dealerDeck.draw(playingDeck);
		Deck d = dealerDeck;
		
		//��� ���
		playerDeck.cardValue();
		dealerDeck.cardValue();
		System.out.println("���� ī��� "+b);
		System.out.println("�� ī��� "+c);
		System.out.println("�� ������ " +playerDeck.cardValue());
		//System.out.println("���� ī��� "+d);
		System.out.println("���� ������ " +dealerDeck.cardValue());
		System.out.println();
		
		//�÷��̾ hit �Ұ��� stay �Ұ���
		while(true) {
			System.out.println("1 ������ HIT, 2������ STAY");
			int hitOrStay=scan.nextInt();
			if(hitOrStay==1) {
				playerDeck.draw(playingDeck);
				System.out.println("�� ī��� "+c);
				System.out.println("�� ������ " +playerDeck.cardValue());
				if(playerDeck.cardValue()>21) {
					System.out.println("�� ������ " +playerDeck.cardValue()+"��. You Busted");
					break;
				
				}
				
			}else if(hitOrStay==2) {
				System.out.println(playerDeck.cardValue()+"���� Stay");
				break;
			}
		}
		//���� hit stay
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}else if((money<bet)||(bet<=0)) {
			System.out.println("�� ����� �ɾ��");
			continue;
		}
		
		
		
	}
	
	
	}

}
