
import java.util.Scanner;


public class CURRENCYCONVERTER {

    public static void main(String[] args) {
    

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToInrRate = 73.5;
        double inrToUsdRate = 1 / usdToInrRate;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert USD to INR");
        System.out.println("2. Convert INR to USD");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertUsdToInr(scanner, usdToInrRate);
                break;
            case 2:
                convertInrToUsd(scanner, inrToUsdRate);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

        scanner.close();
    }

    public static void convertUsdToInr(Scanner scanner, double rate) {
        System.out.print("Enter the amount in USD: ");
        double amountUsd = scanner.nextDouble();
        double amountInr = amountUsd * rate;
        System.out.println(amountUsd + " USD is equal to " + amountInr + " INR.");
    }

    public static void convertInrToUsd(Scanner scanner, double rate) {
        System.out.print("Enter the amount in INR: ");
        double amountInr = scanner.nextDouble();
        double amountUsd = amountInr * rate;
        System.out.println(amountInr + " INR is equal to " + amountUsd + " USD.");
    }
}

    }
    
}
