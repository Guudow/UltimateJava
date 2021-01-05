import java.util.Scanner;

public class Whilfor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("input: ");
            input = scan.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

    }
}
