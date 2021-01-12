import java.util.Scanner;

public class Forgetf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word;
        String secondWord;
        int fNumber, sfNumber;

        System.out.print("Give my a word! ");
        word = scan.next();

        System.out.print("Give me a second word ");
        secondWord = scan.next();

        System.out.print("Greate, now your favorite number?");
        fNumber = scan.nextInt();

        System.out.print("And your second favorite number..");
        sfNumber = scan.nextInt();

        System.out.println("Whew! wasn't that fun?");


    }
}
