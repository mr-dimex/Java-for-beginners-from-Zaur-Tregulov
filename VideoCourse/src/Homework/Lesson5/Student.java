package Homework.Lesson5;

public class Student {
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

        Student st1 = new Student();
        st1.studentID = 1;
        st1.studentName = "Dmitrii";
        st1.studentSurname = "Belikhin";
        st1.course = 4;
        st1.averageRatingMath = 4.8;
        st1.averageRatingEconomics = 4.0;
        st1.averageRatingForeignLanguage = 5.0;

        Student st2 = new Student();
        st2.studentID = 2;
        st2.studentName = "Anna";
        st2.studentSurname = "Petrova";
        st2.course = 4;
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

        // Расчёт средних арифметических оценок студентов
//        System.out.println("Средняя арифметическая оценка студента " + st1.studentName + " " + st1.studentSurname + " равна: "
//                + (st1.averageRatingMath + st1.averageRatingEconomics + st1.averageRatingForeignLanguage) / 3);
//        System.out.println("Средняя арифметическая оценка студента " + st2.studentName + " " + st2.studentSurname + " равна: "
//                + (st2.averageRatingMath + st2.averageRatingEconomics + st2.averageRatingForeignLanguage) / 3);
//        System.out.println("Средняя арифметическая оценка студента " + st3.studentName + " " + st3.studentSurname + " равна: "
//                + (st3.averageRatingMath + st3.averageRatingEconomics + st3.averageRatingForeignLanguage) / 3);

        StudentTest sTest = new StudentTest();
        sTest.averageRating(st1);     // Средняя оценка первого студента
        sTest.averageRating(st2);     // Средняя оценка второго студента
        sTest.averageRating(st3);     // Средняя оценка третьего студента
    }
}