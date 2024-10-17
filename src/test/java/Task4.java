import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ დადებითი რიცხვი:");
            int input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("შეიყვანეთ მხოლოდ დადებითი რიცხვი!");
                return;
            }
        int even = 2;
        int sum = 0;
        while (even <= input) {
            sum += even;
            even += 2;
        }
            System.out.println("ლუწი რიცხვების ჯამი 1-დან " + input + "-ის ჩათვლით არის " + sum + ".");
        } catch (Exception e) {
            System.out.println("გთხოვთ, შეიყვანეთ მხოლოდ დადებითი რიცხვი!");
        } finally {
            scanner.close();
        }
    }
}
