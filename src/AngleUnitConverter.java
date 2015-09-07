package loopsMethodsClasses;

import java.util.Scanner;

public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of conversetions");
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] input = scanner.nextLine().split(" ");
			double number = Double.parseDouble(input[0]);
			
			if (number == 0) {
				System.out.printf("%.6f", number);
				System.out.println();
				continue;
			}
			
			String measure = input[1];
			
			if (measure.equals("deg")) {
				convertDegreesToRadians(number);
			} else if (measure.equals("rad")) {
				convertRadiansToDegrees(number);
			} else {
				throw new IllegalArgumentException("Incorrect measure! Your measure can be"
						+ " \"deg\" or \"rad\" ");
			}
		}
	}
	
	private static void convertDegreesToRadians(double number) {
		double numberInRadians = Math.toRadians(number);
		System.out.printf("%.6f rad", numberInRadians);
		System.out.println();
	}
	
	private static void convertRadiansToDegrees(double number) {
		double numberInDegrees = Math.toDegrees(number);
		System.out.printf("%.6f deg", numberInDegrees);
		System.out.println();
	}
}