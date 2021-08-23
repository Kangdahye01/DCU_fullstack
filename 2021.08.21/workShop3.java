
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		//WorkShop3
		for(int i=0; i<CARD_NUM; i++) {
			int num = i<10? i+1 :i-9;
			boolean isKwang = i<10 && (num ==1 || num ==3 || num ==8);
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	//WorkShop4
	void shuffle() {
		for(int i = 0; i<CARD_NUM; i++) {
			int random = (int)(Math.random() * CARD_NUM);
			SutdaCard temp = cards[i];
			cards[i] = cards[random];
			cards[random] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index <= 0 || index >= CARD_NUM) {
			return null;
		}
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class workShop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + " ");
		}
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
