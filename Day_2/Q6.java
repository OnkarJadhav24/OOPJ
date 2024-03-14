import java.util.Scanner;

class Q6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        scanner.close();
    }
}