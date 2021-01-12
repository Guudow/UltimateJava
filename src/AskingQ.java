import java.util.Scanner;

public class AskingQ {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;
        int feet;
        String height;
        double weight;



        System.out.print( "How old are your? ");
        age = keyboard.nextInt();

        System.out.print( "How tall are your feet ? ");
        feet = keyboard.nextInt();

        System.out.print( "How tall are your? ");
        height = keyboard.next();

        System.out.print( "How much do you weight? ");
        weight = keyboard.nextDouble();

        System.out.println("so you're " + age + " years old, "
                + height + " cm height and you're " + weight + " kg. ");


    }
}
