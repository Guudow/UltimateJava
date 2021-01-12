import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double height;
        double weight;

        System.out.println("Your height in m: ");
        height = sc.nextDouble();
        System.out.println("Your weight in kg: ");
        weight = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("Your BMI is " + BMI + "");

    }
}
