import java.util.Scanner;

public class RectangularPrismVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Rectangular Prism Volume Calculator");
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Calculate the volume
        double volume = length * width * height;

        // Display the result
        System.out.println("The volume of the rectangular prism is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
