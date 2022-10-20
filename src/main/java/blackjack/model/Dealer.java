package blackjack.model;

import java.util.ArrayList;

import static blackjack.model.Deck.cardList;

public class Dealer {
    public ArrayList<Card> dealerCardList;
    public int budget;

    Dealer() {
        this.dealerCardList = new ArrayList<Card>();
    }

    public void getCard() {
        dealerCardList.add(cardList.remove(1));
        dealerCardList.add(cardList.remove(1));
    }

    public int getCardNumberAtFirst() {
        int smallCardNumber = Integer.MAX_VALUE;
        for (Card card : dealerCardList) {
            int number = Integer.parseInt(card.getNumber());
            if (smallCardNumber > number) {
                smallCardNumber = number;
            }
        }
        return smallCardNumber;
    }

    public String getCardTypeAtFirst() {
        int smallCardNumber = 0;
        Card smallCard = new Card("tempName", "tempNumber");
        for (Card card : this.dealerCardList) {
            int number = Integer.parseInt(card.getNumber());
            if (smallCardNumber < number) {
                smallCardNumber = number;
                smallCard = card;
            }
        }
        return smallCard.getType();
    }
}
