package blackjack.model;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cardList = new ArrayList<>();

    Deck() {
        this.generateDeck();
    }

    public void generateDeck() {
        for (CardType type : CardType.values()) {
            for (CardNumber number : CardNumber.values()) {
                cardList.add(new Card(type.getName(), number.getNumber()));
            }
        }
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }
}
