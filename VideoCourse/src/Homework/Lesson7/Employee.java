package Homework.Lesson7;

public class Employee {

    int id;                     // Доступна только внутри пакета (default)
    public String surname;      // Доступна отовсюду (public)
    int age;
    private double salary;      // Недоступна вне класса (private)
    String department;

    public Employee (int id2) {
        id = id2;
    }

    Employee (String surname2) {
        surname = surname2;
    }

    private Employee (double salary2) {
    salary = salary2;
    }

    double salaryX2 () {
        salary *= 2;
        return salary;
    }


    public void showID () {
        System.out.println("id: " + id);
    }

    public void showSurname () {
        System.out.println("Фамилия: " + surname);
    }

    public void showSalary () {
        System.out.println("Зарплата: " + salary);
    }
}