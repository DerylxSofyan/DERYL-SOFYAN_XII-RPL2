import java.util.Scanner;

public class TemperatureConverterApp {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Kelvin");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    celsiusToKelvin();
                    break;
                case 2:
                    celsiusToFahrenheit();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void celsiusToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = (celsius + 273.15);
        System.out.println(celsius + " celsius is equal to " + kelvin + " kelvin.");
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5 + 32);
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
}
