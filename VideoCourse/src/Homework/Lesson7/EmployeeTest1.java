package Homework.Lesson7;

public class EmployeeTest1 {
    public static void main (String [] args) {
        Employee emp1 = new Employee(1);                // public
        Employee emp2 = new Employee("Petrov");    // default
//        Employee emp3 = new Employee(4900.0);             // private конструктор не доступен в другом классе

        System.out.println(emp1.id);                        // Доступно внутри пакета (default)
        System.out.println(emp1.surname);                   // public
//        System.out.println(emp1.salary);                  // private (нет доступа)

        System.out.println(emp2.id);                        // Доступно внутри пакета (default)
        System.out.println(emp2.surname);                   // public
//        System.out.println(emp2.salary);                  // private (нет доступа)

        emp1.showID();
        emp1.showSurname();
        emp1.showSalary();

        System.out.println();

        emp2.showID();
        emp2.showSurname();
        emp2.showSalary();
    }
}