import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[3];
        students [0] = new Student("Калеганов А.В.", "123455677", 18, 1, "Отделение программирования", 2023);
        students [1] = new Student("Агишев Р.А.", "987 - 654 - 3210", 20, 1, "Отделение программирования", 2021);
        students [2] = new Student("Неровнов И.С.", "111 - 222 - 3333", 18, 3, "Веб - дизайн", 2023);

        System.out.println("ФИО и возраст всех студентов :");
        for (Student student : students) {
            System.out.println(student.FIO + " возраст: " + student.getAge());
        }
        System.out.println("Введите название факультета для поиска :");
        String facultyToSearch = input.nextLine();
        System.out.println("\nСписок студентов факультета " + facultyToSearch + ":");
        for (Student student : students) {
            if (student.faculty.equals(facultyToSearch)) {
                System.out.println(student.FIO);
            }
        }
        System.out.print("Введите год поступления : ");
        int yearToCompare = input.nextInt();
        System.out.println("\nСписок студентов, поступивших после " + yearToCompare + ":");
        for (Student student : students) {
            if (student.getAdmissionYear() > yearToCompare) {
                System.out.println(student.FIO);
            }
        }
    }
}

class Person {
    private int age;
    public String FIO;
    public String phone;

    public Person(String FIO, String phone, int age) {
        this.FIO = FIO;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    public int course;
    public String faculty;
    private int admissionYear;

    public Student(String FIO, String phone, int age, int course, String faculty, int admissionYear) {
        super(FIO, phone, age);
        this.course = course;
        this.faculty = faculty;
        this.admissionYear = admissionYear;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }
}

