package blackjack.model;

public enum CardNumber {
    ACE("ace"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("five"),
    SIX("six"),
    SEVEN("seven"),
    EIGHT("eight"),
    NINE("nine"),
    TEN("ten"),
    J("jack"),
    K("king"),
    Q("queen");

    String number;
    CardNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }


}
