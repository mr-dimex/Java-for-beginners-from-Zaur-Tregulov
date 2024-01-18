package Homework.Lesson7_1;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Homework.Lesson7.Employee emp4 = new Homework.Lesson7.Employee(4);           // конструктор public, поэтому объект создался
//        Homework.Lesson7.Employee emp5 = new Homework.Lesson7.Employee("Sidorov");     // default конструктор не доступен в другом пакете
//        Homework.Lesson7.Employee emp6 = new Homework.Lesson7.Employee(4200.0);        // private конструктор не доступен в другом классе

//        System.out.println(emp4.id);          // default не доступно в другом пакете
        System.out.println(emp4.surname);
//        System.out.println(emp4.salary);      // private

        emp4.showID();
        emp4.showSurname();
        emp4.showSalary();
    }
}