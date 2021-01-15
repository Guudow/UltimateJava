import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age = 99;

        System.out.println("What is your name?");
        name = sc.next();

        System.out.println("How old are you?");
        age = sc.nextInt();

        if (age < 16 ) {
            System.out.println("You can't drive." + name+ "");
        }
        if (age < 18) {
            System.out.println("You can't vote. " + name+ "");
        }
        if (age < 25) {
            System.out.println("You can't rent a car." + name+ "");
        }
        if (age >= 25 ) {
            System.out.println("You can do anything that's legal." + name +"");
        }
    }
}
