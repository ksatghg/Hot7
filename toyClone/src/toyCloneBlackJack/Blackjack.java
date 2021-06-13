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
	
	System.out.println("시작한다");
	Double money = 200.00;
	
	while(true) {
		System.out.println("니 재산은 "+money+"원이다. 돈걸어라");
		Double bet = scan.nextDouble();
		System.out.println("넌 "+bet+"원 걸었다.");
		if((money>=bet)&&(bet>=0)) {
		money -= bet;
		if(money<=0) {
			System.out.println("나가");
		break;	
		}
		
		//한장씩 드로우
		playerDeck.draw(playingDeck);
		Card a = playerDeck.getCard(0);
		dealerDeck.draw(playingDeck);
		Card b = dealerDeck.getCard(0);
		
		
		//안보이는거 드로우
		playerDeck.draw(playingDeck);
		Deck c = playerDeck;
		dealerDeck.draw(playingDeck);
		Deck d = dealerDeck;
		
		//밸류 계산
		playerDeck.cardValue();
		dealerDeck.cardValue();
		System.out.println("딜러 카드는 "+b);
		System.out.println("니 카드는 "+c);
		System.out.println("니 점수는 " +playerDeck.cardValue());
		//System.out.println("딜러 카드는 "+d);
		System.out.println("딜러 점수는 " +dealerDeck.cardValue());
		System.out.println();
		
		//플레이어가 hit 할건지 stay 할건지
		while(true) {
			System.out.println("1 누르면 HIT, 2누르면 STAY");
			int hitOrStay=scan.nextInt();
			if(hitOrStay==1) {
				playerDeck.draw(playingDeck);
				System.out.println("니 카드는 "+c);
				System.out.println("니 점수는 " +playerDeck.cardValue());
				if(playerDeck.cardValue()>21) {
					System.out.println("니 점수는 " +playerDeck.cardValue()+"점. You Busted");
					break;
				
				}
				
			}else if(hitOrStay==2) {
				System.out.println(playerDeck.cardValue()+"에서 Stay");
				break;
			}
		}
		//딜러 hit stay
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}else if((money<bet)||(bet<=0)) {
			System.out.println("돈 제대로 걸어라");
			continue;
		}
		
		
		
	}
	
	
	}

}
