package blackjack.model;

import static blackjack.model.Deck.cardList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DealerTest {

    // BeforeEach로 dealder, deck 만들어도 Test함수에서 적용이 안되는듯
//    @BeforeEach
//    public static void setUp() {
//        Dealer dealer = new Dealer();
//        Deck deck = new Deck();
//    }

    @Test
    public void dealerGetCardTest() {
        Dealer dealer = new Dealer();
        dealer.getCard();
        System.out.println(dealer.dealerCardList.get(0).getType());
        System.out.println(dealer.dealerCardList.get(0).getNumber());
        assertThat(dealer.dealerCardList.size()).isEqualTo(2);
        assertThat(cardList.size()).isEqualTo(50);
    }

    @Test
    public void dealerCardShowingTest() {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        System.out.println(cardList.size());
        dealer.getCard();
        System.out.println(cardList.size());
        assertThat(dealer.getCardNumberAtFirst()).isEqualTo(2);
    }
}
