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
	
	
	Double money = 200.00;
	
	while(money>0) {
		System.out.println("�����Ѵ�");
		System.out.println("�� ����� "+money+"���̴�. ���ɾ��");
		Double bet = scan.nextDouble();
		if(bet<=0) {
			System.out.println("�ٽðɾ�");
			continue;
		}
		System.out.println("�� "+bet+"�� �ɾ���.");
		boolean endRound = false;
		
		
		if(bet>money) {
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
		//System.out.println("���� ������ " +dealerDeck.cardValue());
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
					System.out.println("You Busted");
					money -= bet;
					endRound = true;
					break;
				
				}
				
			}else if(hitOrStay==2) {
				System.out.println("�÷��̾� "+playerDeck.cardValue()+"���� Stay");
				break;
			}
		}
		//���� hit stay
		while((dealerDeck.cardValue()<17)&&endRound ==false) {
				dealerDeck.draw(playingDeck);
				System.out.println("���� hit");
				System.out.println(dealerDeck);
			}
		if((dealerDeck.cardValue()>=17)&&(dealerDeck.cardValue()<=21)&&endRound==false) {
			System.out.println("���� ī��� "+ dealerDeck);
			System.out.println("���� Stay");
			//System.out.println("���� ������ "+ dealerDeck.cardValue()+" ��");
		}
		if((dealerDeck.cardValue()>21) && endRound ==false) {
			System.out.println("���� ������ "+ dealerDeck.cardValue()+" ��");
			System.out.println("���� ����Ʈ. ���� �¸�");
			money += bet;
			endRound = true;
		}
		
		//������
		if((dealerDeck.cardValue()>playerDeck.cardValue())&& endRound == false) {
			System.out.println("���� ������ "+ dealerDeck.cardValue()+" ��");
			System.out.println("���� �¸�!");
			money-= bet;
			endRound = true;
		}
		if((dealerDeck.cardValue()<playerDeck.cardValue())&& endRound == false) {
			System.out.println("���� ������ "+ dealerDeck.cardValue()+" ��");
			System.out.println("���� �¸�!");
			money+= bet;
			endRound = true;
		}
		//������ ��� Ǫ��
		if((dealerDeck.cardValue() == playerDeck.cardValue())&& endRound == false) {
			System.out.println("Push");
			endRound =true;
		}
		
		
		
		
		
		
		//���ӳ�, �� �ʱ�ȭ
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			
			System.out.println("���� ����"+"\n");
		}
		System.out.println("�ʴ� �Ļ��ߴ�. ������ �λ� �ĸ��� �������̴�.");
	
	
	
	
	
	
	
	
	
	
	
		}
		}


