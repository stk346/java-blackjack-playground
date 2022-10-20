package blackjack.model;

import static blackjack.model.Deck.cardList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DealerTest {
    Dealer dealer;
    Deck deck;
//     BeforeEach로 dealder, deck 만들어도 Test함수에서 적용이 안되는듯
    @BeforeEach
    public void setUp() {
        dealer = new Dealer();
        deck = new Deck();
    }

    @Test
    public void dealerGetCardTest() {
        dealer.getCard();
        dealer.getCard();
        System.out.println(dealer.dealerCardList.get(0).getType());
        System.out.println(dealer.dealerCardList.get(0).getNumber());
        assertThat(dealer.dealerCardList.size()).isEqualTo(2);
        assertThat(cardList.size()).isEqualTo(50);
    }

    @Test
    public void dealerCardShowingTest() {
        System.out.println(cardList.size());
        dealer.getCard();
        dealer.getCard();
        System.out.println(cardList.size());
        assertThat(dealer.getCardNumberAtFirst()).isEqualTo(2);
    }

    @Test
    public void dealerNumberThresholdTest() {
        dealer.getCard();
        dealer.getCard();
        dealer.getCard();
        dealer.getCard();
        dealer.getCard();
        assertThat(dealer.isUnderSeventeen()).isEqualTo(false);
    }

    @Test
    public void getCardTestWhenUnderSeventeen() {
        while (dealer.isUnderSeventeen()) {
            dealer.getCardWhenUnderSixteen();
            System.out.println(dealer.dealerCardList.stream().mapToInt(x -> Integer.parseInt(x.getNumber())).sum());
        }
        assertThat(dealer.isUnderSeventeen()).isEqualTo(false);
    }
}
