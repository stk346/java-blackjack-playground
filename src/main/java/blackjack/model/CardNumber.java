package blackjack.model;

public enum CardNumber {
    ACE("ace"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
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
