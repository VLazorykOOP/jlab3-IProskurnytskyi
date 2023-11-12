import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
    private String employeeId;

    public Teacher(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Employee ID: " + employeeId);
    }
}

class DepartmentChair extends Teacher {
    private String department;

    public DepartmentChair(String name, int age, String employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[3];

        people[0] = new Student("John", 18, "12345");
        people[1] = new Teacher("Dr. Smith", 45, "13578");
        people[2] = new DepartmentChair("Prof. Johnson", 50, "12478", "Computer Science");

        for (Person person : people) {
            person.show();
            System.out.println();
        }
        scanner.close();
    }
}
