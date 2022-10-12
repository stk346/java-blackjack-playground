package nextstep.fp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return true;
            }
        });
        assertThat(actual).isEqualTo(new Car("pobi", 1));
    }

    @Test
    public void 정지() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return false;
            }
        });
        assertThat(actual).isEqualTo(new Car("pobi", 0));
    }

    @Test
    public void 이동_실습() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(() -> true);
        assertEquals(new Car("pobi", 1), actual);
    }

    @Test
    public void 정지_실습() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(() -> false);
        assertEquals(new Car("pobi", 0), actual);
    }


}
