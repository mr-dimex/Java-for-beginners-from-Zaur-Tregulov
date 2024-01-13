package Homework.Lesson5;

public class Employee {
    Employee (int i, String sur, int a, double sal, String d) {
        id = i;
        surname = sur;
        age = a;
        salary = sal;
        department = d;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    double salaryX2 () {                    // Метод для увеличения зарплаты вдвое
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main (String [] args) {
        Employee e1 = new Employee(1, "Belikhin", 28, 3850.34, "IT");
        Employee e2 = new Employee(2, "Orlova", 30, 2650.95, "EC");

        System.out.println("Зарплата работника " + e1.surname + " равна: " + e1.salary);      // Зарплата первого работника
        System.out.println("Зарплата работника " + e2.surname + " равна: " + e2.salary);      // Зарплата второго работника

        e1.salaryX2();                      // Увеличиваем вдвое зарплату первому работнику
        e2.salaryX2();                      // Увеличиваем вдвое зарплату второму работнику

        System.out.println();

        System.out.println("Увеличенная зарплата работника " + e1.surname + " равна: " + e1.salary);      // Зарплата первого работника после увеличения
        System.out.println("Увеличенная зарплата работника " + e2.surname + " равна: " + e2.salary);      // Зарплата второго работника после увеличения
    }
}