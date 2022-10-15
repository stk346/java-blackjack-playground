package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardTest {

    @Test
    public void Enum테스트() {
        assertThat(CardType.CLOVER.getName()).isEqualTo("clover");
    }

}
