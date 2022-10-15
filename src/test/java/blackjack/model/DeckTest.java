package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DeckTest {

    @Test // 카드가 제대로 생성됐는지 확인
    public void DeckGenerationTest() {
        Deck deck = new Deck();
        assertThat(deck.cardList.get(0).getType()).isEqualTo("클로버");
        assertThat(deck.cardList.get(0).getNumber()).isEqualTo("ace");
    }


    @Test // 생성된 카드 길이가
    public void DeckLengthTest() {
        Deck deck = new Deck();
        assertThat(deck.cardList.size()).isEqualTo(52);
    }
}
