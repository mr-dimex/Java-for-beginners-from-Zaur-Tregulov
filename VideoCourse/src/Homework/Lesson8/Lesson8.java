package Homework.Lesson8;

public class Lesson8 {

    static double multiplication (double a, double b, double c) {
        double result = a * b * c;
        return result;
    }

    static void division (int a, int b) {
        int result = a / b;
        int result2 = a % b;
        System.out.println("Частное: " + result);
        System.out.println("Остаток: " + result2);
    }
}

class Lesson8Test {
    public static void main (String [] args) {
        System.out.println(Lesson8.multiplication(3.2, 4.5, 5.9));          // Вывод результата работы static метода
        double multiplicationResult = Lesson8.multiplication(24, 3, 56);    // Присвоение результата работы static метода переменной
        System.out.println(multiplicationResult);                                    // Вывод переменной
        System.out.println();
        Lesson8.division(24, 2);                                                // Вывод результата работы static метода
        Lesson8.division(10, 3);                                                // Вывод результата работы static метода
    }
}