
import org.junit.jupiter.api.*;

import java.beans.Beans;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculationTest {
    public static void main(String[] args) {

   assertThat(Calculator.calculation(2,4, '*')).isEqualTo(8);
   assertThat(Calculator.calculation(8,2, '/')).isEqualTo(8);
   assertThat(Calculator.calculation(2,1, '-')).isEqualTo(8);
   assertThat(Calculator.calculation(2,2, '+')).isEqualTo(8);

//   assertThatThrownBy(() -> Calculator.calculation(8, 4, '_'))
//           .isInstanceOf(IllegalStateException.class);
    }



    private static Beans assertThatThrownBy(Object o) {
        return null;
    }

    @Test
    void  evaluatesExpression(){
        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
    }
        }
