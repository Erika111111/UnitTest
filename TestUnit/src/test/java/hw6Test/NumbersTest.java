package hw6Test;

import org.junit.jupiter.api.Test;


import static HW6.Numbers.calculateAverage1;
import static HW6.Numbers.calculateAverage2;
import static org.mockito.Mockito.*;

import static HW6.Numbers.*;


//b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//- ""Средние значения равны"", если средние значения списков равны.
public class NumbersTest {

    @Test
    public void TestNum() {

        double average1 = calculateAverage1(list1);

        double average2 = calculateAverage2(list2);

        if ( average1> average2) {
            System.out.println("Первый список имеет большее среднее значение");
        }
        if ( average1 < average2) {
            System.out.println("Второй список имеет большее среднее значение");
        }
        if (average1 == average2) {
            System.out.println("Средние значения равны");
        }
    }


}