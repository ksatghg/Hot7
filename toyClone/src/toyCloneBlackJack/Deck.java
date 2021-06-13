package toyCloneBlackJack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	ArrayList<Card> cards = new ArrayList<>();
	
	public void createDeck() {
		for(Suit suit : Suit.values()) {
			for(Value val : Value.values()) {
				this.cards.add(new Card(suit, val));
			}
		}
	}
	@Override
	public String toString() {
		String cardList = "";
		for(Card list : this.cards) {
			cardList += list.toString()+". ";
		}
		return cardList;
	}
	public int deckSize() {
		int a = this.cards.size();
		return a;
	}
	
	public void shuffleDeck() {
		ArrayList<Card> tmp = new ArrayList<Card>();
		int randomDeckIndex = 0;
		int origin = this.cards.size(); 
		Random random = new Random();
		for(int i=0; i<origin; i++) {
			randomDeckIndex=random.nextInt((this.cards.size()-1-0)+1)+0;
			tmp.add(this.cards.get(randomDeckIndex));
			this.cards.remove(randomDeckIndex);
		}
		this.cards=tmp;
	}
	
	public void deckList() {
		for(Card list : this.cards) {
			System.out.println(list);
		}
		
		
	}
	
	public void removeCard(int i) {
		this.cards.remove(i);
	}
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	
	public void draw(Deck dro) {
		this.cards.add(dro.getCard(0));
		dro.removeCard(0);
	}
	public void moveAllToDeck(Deck moveTo) {
		int thisDeckSize = this.cards.size();
		for(int i=0; i<thisDeckSize; i++) {
			moveTo.addCard(this.getCard(i));
		}
		for(int i=0;i<thisDeckSize; i++) {
			this.removeCard(0);
		}
	}
	public int cardValue() {
		int totalValue=0;
		int aces = 0;
		
		for(Card aCard : this.cards) {
			switch(aCard.getVal()) {
			case TWO: totalValue +=2; break;
			case THREE: totalValue +=3; break;
			case EIGHT: totalValue +=8;
				break;
			case FIVE: totalValue +=5;
				break;
			case FOUR: totalValue +=4;
				break;
			case JACK: totalValue +=10;
				break;
			case KING: totalValue +=10;
				break;
			case NINE: totalValue +=9;
				break;
			case QUEEN: totalValue +=10;
				break;
			case SEVEN: totalValue +=7;
				break;
			case SIX: totalValue +=6;
				break;
			case TEN: totalValue +=10;
				break;
			case ACE: aces+=1; break;
			}
		}
		for(int i =0; i<aces; i++) {
			if(totalValue>10) {
				totalValue +=1;
			}else {
				totalValue+=11;
			}
		}
		
		return totalValue;
	}
	
	
}
