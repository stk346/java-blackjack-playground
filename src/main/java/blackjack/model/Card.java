package blackjack.model;

public class Card {
    private String type;
    private String number;

    Card(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return this.type;
    }

    public String getNumber() {
        return this.number;
    }


}
