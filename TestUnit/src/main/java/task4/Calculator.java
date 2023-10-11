package task4;

public class Calculator {
    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }
    //метод принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки
    public double calculateDiscount(double sumPurchase, double percentDiscount){
        if(sumPurchase < 0 || percentDiscount < 0){
            throw new ArithmeticException("error");
        }
        double res = sumPurchase - (sumPurchase * percentDiscount / 100);
        return res;
    }



}

