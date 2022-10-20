package blackjack.model;

import org.junit.jupiter.api.Test;

import static blackjack.model.Deck.cardList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DeckTest {

    @Test // 카드가 제대로 생성됐는지 확인
    public static void DeckGenerationTest() {
        Deck deck = new Deck();
        assertThat(cardList.get(0).getType()).isEqualTo("클로버");
        assertThat(cardList.get(0).getNumber()).isEqualTo("ace");
    }

    @Test // 생성된 카드 길이가
    public void DeckLengthTest() {
        Deck deck = new Deck();
        assertThat(cardList.size()).isEqualTo(52);
    }
}
