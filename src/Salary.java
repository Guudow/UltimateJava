import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Hello. What is your name? ");
        name = scanner.next();
        System.out.println("Hi " + name + " How old are you? ");
        age = scanner.nextInt();
        System.out.println("so you're " + age + ", eh? that's not old at all!");
        System.out.println("How much do you make " + name + "?");
        salary = scanner.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year!" );


    }
}
