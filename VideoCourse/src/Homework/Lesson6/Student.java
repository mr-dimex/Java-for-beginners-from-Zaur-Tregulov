package Homework.Lesson6;

public class Student {

    Student (int id, String name, String surname, int c, double aRMath, double aREconomics, double aRForeignLanguage) {
        studentID = id;
        studentName = name;
        studentSurname = surname;
        course = c;
        averageRatingMath = aRMath;
        averageRatingEconomics = aREconomics;
        averageRatingForeignLanguage = aRForeignLanguage;
    }

    Student (int id, String name, String surname, int c) {
        this (id, name, surname, c, 0.0, 0.0, 0.0);
    }

    Student () {
    }

    int studentID;
    String studentName;
    String studentSurname;
    int course;
    double averageRatingMath;
    double averageRatingEconomics;
    double averageRatingForeignLanguage;
}

class StudentTest {

    void averageRating (Student st) {
        double average = (st.averageRatingMath + st.averageRatingEconomics + st.averageRatingForeignLanguage) / 3;
        System.out.println("Средняя арифметическая оценка студента "
                + st.studentName + " " + st.studentSurname + " равна: " + average);
    }

    public static void main (String[] args) {

        Student st1 = new Student(1, "Dmitrii", "Belikhin", 4, 4.8, 4.0, 5.0);

        Student st2 = new Student(2, "Anna", "Petrova", 4);
        st2.averageRatingMath = 4.5;
        st2.averageRatingEconomics = 4.7;
        st2.averageRatingForeignLanguage = 4.4;

        Student st3 = new Student();
        st3.studentID = 3;
        st3.studentName = "Aleksey";
        st3.studentSurname = "Ivanov";
        st3.course = 3;
        st3.averageRatingMath = 3.3;
        st3.averageRatingEconomics = 4.0;
        st3.averageRatingForeignLanguage = 4.2;

        StudentTest sTest = new StudentTest();
        sTest.averageRating(st1);     // Средняя оценка первого студента
        sTest.averageRating(st2);     // Средняя оценка второго студента
        sTest.averageRating(st3);     // Средняя оценка третьего студента
    }
}