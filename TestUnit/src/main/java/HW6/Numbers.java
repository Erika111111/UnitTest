package HW6;

import java.util.ArrayList;
import java.util.List;

// Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
//a. Рассчитывает среднее значение каждого списка.
//b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//- ""Средние значения равны"", если средние значения списков равны.
public class Numbers  {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addNumList1() {
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(9);
        list1.add(0);
    }

    public void addNumList2() {
        list2.add(9);
        list2.add(-1);
        list2.add(6);
        list2.add(0);
        list2.add(1);
    }


    // нахождение среднего значения первого списка
    private static double calculateAverage1(List<Integer> list1) {
        int sum = 0;
        for (int num : list1) {
            sum+=num;
        }
        return ((double) sum / list1.size());
    }

    // нахождение среднего значения второго списка
    private static double calculateAverage2(List<Integer> list2) {
        int sum = 0;
        for (int num : list2) {
            sum+=num;
        }
        return ((double) sum / list2.size());
    }

}
