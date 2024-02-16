import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for temperature
        System.out.print("Enter temperature (e.g., 25C, 77F, 298K): ");
        String input = scanner.nextLine().toUpperCase();
        
        // Determine the convention and value
        double temperature = Double.parseDouble(input.substring(0, input.length() - 1));
        char unit = input.charAt(input.length() - 1);

        // Convert and display the results
        switch (unit) {
            case 'C':
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(temperature));
                System.out.println("Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 'F':
                System.out.println("Celsius: " + fahrenheitToCelsius(temperature));
                System.out.println("Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 'K':
                System.out.println("Celsius: " + kelvinToCelsius(temperature));
                System.out.println("Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Unknown temperature unit.");
                break;
        }

        scanner.close();
    }

    // Conversion functions
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
