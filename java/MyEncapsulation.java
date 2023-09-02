package java;
import java.util.Scanner;

public class MyEncapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            this.age = newAge;
        } else {
            System.out.println("Age cannot be negative");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age again: ");
            int inputAge = sc.nextInt();
            setAge(inputAge);
        }
    }

    public static void main(String[] args) {
        MyEncapsulation obj = new MyEncapsulation();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        obj.setName(sc.nextLine());

        System.out.print("Enter age: ");
        obj.setAge(sc.nextInt());

        sc.close();

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
