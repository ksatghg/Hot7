package toyCloneBlackJack;



public class Card {
	Suit suit;
	Value val;
	
	
	public Card(Suit suit, Value val) {
		this.suit=suit;
		this.val=val;
	}
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Value getVal() {
		return val;
	}

	public void setVal(Value val) {
		this.val = val;
	}

@Override
public String toString() {
	return suit+"-"+val;
}
	
	
	
	
	
}
