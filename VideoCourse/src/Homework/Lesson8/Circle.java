package Homework.Lesson8;

public class Circle {
    public static final double PI = 3.14;

    public double circleArea (double radius1) {
        double area = PI * radius1 * radius1;
        return area;
    }

    public static double circumference (double radius2) {
        double circumference = 2 * PI * radius2;
        return circumference;
    }

    public void info (double radius3) {
        System.out.println("Радиус: " + radius3);
        System.out.println("Площадь круга составляет: " + circleArea(radius3));
        System.out.println("Длина окружности составляет: " + circumference(radius3));
    }
}

class CircleTest {
    public static void main (String [] args) {
        Circle c = new Circle();
        System.out.println(c.circleArea(3.5)); // Вызов non-static метода
        System.out.println();
        System.out.println(Circle.circumference(3.5)); // Вызов static метода (метода всего класса)
        System.out.println();
        c.info(3.5); // Вызов non-static метода
    }
}