package seminar3_task1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class AdditionTest {

    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void testAdditionNumbers() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    // проверка на то что принимает калькулятор символ или цифру
    public void testAddDoesNotAcceptChar() {

        try {
            char invalidChar = 'a';
            int result = calculator.add(2, invalidChar);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Input must be an integer.");
        }
    }
}
