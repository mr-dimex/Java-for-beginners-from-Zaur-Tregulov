package Homework.Lesson6;

public class OverloadedMethods {
    int sum () {
        int result = 0;
        System.out.println("Сумма всех чисел равна: " + result);
        return result;
    }

    int sum (int a) {
        int result = a;
        System.out.println("Сумма всех чисел равна: " + result);
        return result;
    }

    int sum (int a, int b) {
        int result = a + b;
        System.out.println("Сумма всех чисел равна: " + result);
        return result;
    }

    int sum (int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Сумма всех чисел равна: " + result);
        return result;
    }

    int sum (int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Сумма всех чисел равна: " + result);
        return result;
    }
}

class OverloadedMethodsTest {
    public static void main (String [] args) {
        OverloadedMethods oM = new OverloadedMethods();
        oM.sum();
        oM.sum(1);
        oM.sum(1, 2);
        oM.sum(1, 2, 3);
        oM.sum(1, 2, 3, 4);
    }
}