import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სიმბოლო:");
            char symbol = scanner.next().charAt(0);
            switch (symbol) {
                case 'ა':
                case 'ე':
                case 'ი':
                case 'ო':
                case 'უ':
                    System.out.println("თქვენ მიერ შეყვანილი სიმბოლო " + "'" + symbol + "'" + " არის ხმოვანი.");
                    break;
                case 'ბ':
                case 'გ':
                case 'დ':
                case 'ვ':
                case 'ზ':
                case 'თ':
                case 'კ':
                case 'ლ':
                case 'მ':
                case 'ნ':
                case 'პ':
                case 'ჟ':
                case 'რ':
                case 'ს':
                case 'ტ':
                case 'ფ':
                case 'ქ':
                case 'ღ':
                case 'ყ':
                case 'შ':
                case 'ჩ':
                case 'ც':
                case 'ძ':
                case 'წ':
                case 'ჭ':
                case 'ხ':
                case 'ჯ':
                case 'ჰ':
                    System.out.println("თქვენ მიერ შეყვანილი სიმბოლო " + "'" + symbol + "'" + " არის თანხმოვანი.");
                    break;
                default:
                    System.out.println("შეიყვანეთ სწორი სიმბოლო!");
            }

    }
}
