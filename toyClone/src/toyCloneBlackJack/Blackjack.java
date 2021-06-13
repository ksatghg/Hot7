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
		System.out.println("시작한다");
		System.out.println("니 재산은 "+money+"원이다. 돈걸어라");
		Double bet = scan.nextDouble();
		if(bet<=0) {
			System.out.println("다시걸어");
			continue;
		}
		System.out.println("넌 "+bet+"원 걸었다.");
		boolean endRound = false;
		
		
		if(bet>money) {
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
		//System.out.println("딜러 점수는 " +dealerDeck.cardValue());
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
					System.out.println("You Busted");
					money -= bet;
					endRound = true;
					break;
				
				}
				
			}else if(hitOrStay==2) {
				System.out.println("플레이어 "+playerDeck.cardValue()+"에서 Stay");
				break;
			}
		}
		//딜러 hit stay
		while((dealerDeck.cardValue()<17)&&endRound ==false) {
				dealerDeck.draw(playingDeck);
				System.out.println("딜러 hit");
				System.out.println(dealerDeck);
			}
		if((dealerDeck.cardValue()>=17)&&(dealerDeck.cardValue()<=21)&&endRound==false) {
			System.out.println("딜러 카드는 "+ dealerDeck);
			System.out.println("딜러 Stay");
			//System.out.println("딜러 점수는 "+ dealerDeck.cardValue()+" 점");
		}
		if((dealerDeck.cardValue()>21) && endRound ==false) {
			System.out.println("딜러 점수는 "+ dealerDeck.cardValue()+" 점");
			System.out.println("딜러 버스트. 너의 승리");
			money += bet;
			endRound = true;
		}
		
		//점수비교
		if((dealerDeck.cardValue()>playerDeck.cardValue())&& endRound == false) {
			System.out.println("딜러 점수는 "+ dealerDeck.cardValue()+" 점");
			System.out.println("딜러 승리!");
			money-= bet;
			endRound = true;
		}
		if((dealerDeck.cardValue()<playerDeck.cardValue())&& endRound == false) {
			System.out.println("딜러 점수는 "+ dealerDeck.cardValue()+" 점");
			System.out.println("너의 승리!");
			money+= bet;
			endRound = true;
		}
		//동점일 경우 푸시
		if((dealerDeck.cardValue() == playerDeck.cardValue())&& endRound == false) {
			System.out.println("Push");
			endRound =true;
		}
		
		
		
		
		
		
		//게임끝, 덱 초기화
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			
			System.out.println("게임 종료"+"\n");
		}
		System.out.println("너는 파산했다. 도박은 인생 파멸의 지름길이다.");
	
	
	
	
	
	
	
	
	
	
	
		}
		}


