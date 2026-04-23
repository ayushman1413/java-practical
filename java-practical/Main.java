import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        this.age = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails();
        s1.displayDetails();
    }
}