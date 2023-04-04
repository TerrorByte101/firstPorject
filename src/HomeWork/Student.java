package HomeWork;

public class Student {
    int id = 0;
    String name = "Name";
    String surname = "Surname";
    byte yearOfStudy = 0;
    double averageMathGrade = 0.0;
    double averageEconomyGrade = 0.0;
    double averageForeignLanguageGrade = 0.0;
}

class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.id = 1;
        student1.name = "John";
        student1.surname = "Smith";
        student1.yearOfStudy = 1;
        student1.averageMathGrade = 4;
        student1.averageEconomyGrade = 5;
        student1.averageForeignLanguageGrade = 5;

        student2.id = 2;
        student2.name = "Jerry";
        student2.surname = "Smith";
        student2.yearOfStudy = 3;
        student2.averageMathGrade = 5;
        student2.averageEconomyGrade = 5;
        student2.averageForeignLanguageGrade = 5;

        student3.id = 3;
        student3.name = "Adrian";
        student3.surname = "Finn";
        student3.yearOfStudy = 4;
        student3.averageMathGrade = 2;
        student3.averageEconomyGrade = 4;
        student3.averageForeignLanguageGrade = 4;

        System.out.print("Средняя оценка студента " + student1.name + ": ");
        System.out.println((student1.averageMathGrade + student1.averageEconomyGrade + student1.averageForeignLanguageGrade) / 3);

        System.out.print("Средняя оценка студента " + student2.name + ": ");
        System.out.println((student2.averageMathGrade + student2.averageEconomyGrade + student2.averageForeignLanguageGrade) / 3);

        System.out.print("Средняя оценка студента " + student3.name + ": ");
        System.out.println((student3.averageMathGrade + student3.averageEconomyGrade + student3.averageForeignLanguageGrade) / 3);
    }
}
