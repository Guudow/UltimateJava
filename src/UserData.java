import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String FirstName, lastName;
        double grade;
        int studentId;
        String loginName;
        double GPA;

        System.out.println("First name: ");
        FirstName = scan.next();
        System.out.println("Last name: ");
        lastName = scan.next();
        System.out.println("Grade (9-12): ");
        grade = scan.nextDouble();
        System.out.println("Student ID: ");
        studentId = scan.nextInt();
        System.out.println("Login ");
        loginName = scan.next();
        System.out.println("GBA (0.0-4.0): ");
        GPA = scan.nextDouble();

        System.out.println("Your information: ");
        System.out.println("            Login: " + loginName + " ");
        System.out.println("            ID:" + studentId + " ");
        System.out.println("            Name:" + FirstName + " " +lastName+ "");
        System.out.println("            GBA:" + GPA + " ");
        System.out.println("            Grade:" + grade + " ");




    }
}
