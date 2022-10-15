package blackjack.model;

public enum CardType {
    CLOVER("클로버"),
    DIAMOND("다이아몬드"),
    HEART("하트"),
    SPADE("스페이드");

    public String cardName;

    CardType(String cardName) {
        this.cardName = cardName;
    }

    public String getName() {
        return this.cardName;
    }
}
