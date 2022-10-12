package nextstep.fp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LambdaTest {
    private List<Integer> numbers;

    @BeforeEach
    public void setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void printAllOld() throws Exception {
        Lambda.printAllOld(numbers);
    }

    @Test
    public void printAllLambda() throws Exception {
        Lambda.printAllLambda(numbers);
    }

    @Test
    public void runThread() throws Exception {
        Lambda.runThread();
    }

    @Test
    public void sumAll() throws Exception {
        int sum = Lambda.sumAll(numbers);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    public void sumAllEven() throws Exception {
        int sum = Lambda.sumAllEven(numbers);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void sumAllOverThree() throws Exception {
        int sum = Lambda.sumAllOverThree(numbers);
        assertThat(sum).isEqualTo(15);
    }

    @Test
    public void sumAllAnonymousTest() {
        int sum = Lambda.sumAllAnonymous(numbers);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    public void sumAllEvenAnonymousTest() {
        int sum = Lambda.sumAllEvenAnonymous(numbers);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void sumAllOverThreeAnonymousTest() {
        int sum = Lambda.sumAllOverThreeAnonymous(numbers);
        assertThat(sum).isEqualTo(15);
    }

    @Test
    public void sumAllLambdaTest() {
        int sum = Lambda.sumAllLambda(numbers);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    public void sumAllEvenLambdaTest() {
        int sum = Lambda.sumAllEvenLambda(numbers);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    public void sumAllOverThreeTest() {
        int sum = Lambda.sumAllOverThreeLambda(numbers);
        assertThat(sum).isEqualTo(15);
    }
}
