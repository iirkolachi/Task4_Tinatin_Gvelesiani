import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ ქულა 0-დან 100-ის ჩათვლით:");
            int score = scanner.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("თქვენი შეფასებაა A!");
            } else if (score >= 80 && score <= 89) {
                System.out.println("თქვენი შეფასებაა B!");
            } else if (score >= 70 && score <= 79) {
                System.out.println("თქვენი შეფასებაა C!");
            } else if (score >= 60 && score <= 69) {
                System.out.println("თქვენი შეფასებაა D!");
            } else if (score >= 0 && score < 60) {
                System.out.println("თქვენი შეფასებაა F!");
            } else {
                System.out.println("გთხოვთ, შეიყვანოთ სწორი ქულა!");
            }
        } catch (Exception e) {
            System.out.println("გთხოვთ, შეიყვანოთ მხოლოდ ციფრები!");
        } finally {
            scanner.close();
        }
    }
}
