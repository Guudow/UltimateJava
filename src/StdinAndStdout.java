import java.util.Scanner;

public class StdinAndStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double a = scan.nextDouble();
        String b = scan.next();
        // b = scan.nextLine();
        if (b.isEmpty()) {
            b = scan.nextLine();
        }

        // Write your code here.

        System.out.println("String: " + b);
        System.out.println("Double: " + a);
        System.out.println("Int: " + i);

    }
}