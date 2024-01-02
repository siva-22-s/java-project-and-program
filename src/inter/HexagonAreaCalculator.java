package inter;

import java.util.Scanner;

public class HexagonAreaCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the side length of the hexagon: ");
			double sideLength = scanner.nextDouble();

			double area = calculateHexagonArea(sideLength);

			System.out.println("The area of the hexagon is: " + area);
		}
    }

    public static double calculateHexagonArea(double sideLength) {
        return (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
    }
}