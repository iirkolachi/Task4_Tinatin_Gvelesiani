import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            int randomNumber = random.nextInt(50) + 1;
            System.out.println(randomNumber);
            int userNumber;
            do {
                System.out.println("შეიყვანეთ რიცხვი:");
                userNumber = scanner.nextInt();
                if (randomNumber > userNumber) {
                    System.out.println("სამწუხაროდ, თქვენ შეიყვანეთ ნაკლები რიცხვი.");
                } else if (randomNumber < userNumber) {
                    System.out.println("სამწუხაროდ, თქვენ შეიყვანეთ მეტი რიცხვი.");
                } else {
                    System.out.println("გილოცავთ, თქვენ გამოიცანით რიცხვი!");
                }
            } while (randomNumber != userNumber);
        } catch (Exception e) {
            System.out.println("გთხოვთ, შეიყვანოთ მხოლოდ რიცხვები!");
        } finally {
            scanner.close();
        }
    }
}
