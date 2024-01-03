package Homework;

public class Lesson2 {
    public static void main(String[] args) {

        // Создание переменных всех целочисленных типов данных (по 4 шт.)

        byte b1 = 12;       // Запись числа в десятичной системе счисления
        byte b2 = 0b1100;   // Запись числа 12 в двоичной системе счисления
        byte b3 = 014;      // Запись числа 12 в восьмеричной системе счисления
        byte b4 = 0xC;      // Запись числа 12 в шестнадцатеричной системе счисления

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;            // Запись числа в десятичной системе счисления
        short s2 = 0b010100010100;  // Запись числа 1300 в двоичной системе счисления
        short s3 = 02424;           // Запись числа 1300 в восьмеричной системе счисления
        short s4 = 0x514;           // Запись числа 1300 в шестнадцатеричной системе счисления

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;     // Запись числа в десятичной системе счисления
        int i2 = 0b0;   // Запись числа 0 в двоичной системе счисления
        int i3 = 00;    // Запись числа 0 в восьмеричной системе счисления
        int i4 = 0x0;   // Запись числа 0 в шестнадцатеричной системе счисления

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;                       // Запись числа в десятичной системе счисления
        long l2 = 0b0111010110111100110100010101L;  // Запись числа 123456789 в двоичной системе счисления
        long l3 = 0726746425L;                      // Запись числа 123456789 в восьмеричной системе счисления
        long l4 = 0x75BCD15L;                       // Запись числа 123456789 в шестнадцатеричной системе счисления

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        // Создание переменных типов данных float, double, boolean (по 2 шт.)

        float f1 = 28.561F;
        float f2 = 9.4F;

        System.out.println(f1);
        System.out.println(f2);

        double d1 = 787.5792;
        double d2 = 2.71828182845904;

        System.out.println(d1);
        System.out.println(d2);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        // Создание переменных типов данных char всеми возможными способами

        char c1 = 'd';
        char c2 = 101;
        char c3 = '\u1995';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}