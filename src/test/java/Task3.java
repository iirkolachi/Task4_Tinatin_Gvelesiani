import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("შეიყვანეთ ციფრი");
            int input = scanner.nextInt();
            for (int i = 1; i <= 10; i++)
                System.out.println(input + " x " + i + " = " + input * i);
        } catch (Exception e) {
            System.out.println("შეიყვანეთ მხოლოდ ციფრი!");
        } finally {
            scanner.close();
        }
    }
}
