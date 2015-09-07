package loopsMethodsClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range of your numbers!");
		System.out.println("First your start number and after that your end number,"
				+ "separated by a space: ");
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		if (start < 0 || start > end || end > 999) {
			throw new IllegalArgumentException("Your start number must be at least 0 and"
					+ " your end number must be lower than 1000 ");
		}
		
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		outputList = findSymmetricNumbersInRange(start, end);
		
		printResult(outputList, start, end);
	}
	
	private static ArrayList<Integer> findSymmetricNumbersInRange(int start, int end) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		for (int i = start; i <= end; i++) {
			if (i / 10 == 0) {
				outputList.add(i);
			} else if (i / 100 == 0) {
				if (i % 10 == i / 10) {
					outputList.add(i);
				}
			} else if (i % 10 == i / 100) {
				outputList.add(i);
			}
		}
		
		return outputList;
	}
	
	private static void printResult(ArrayList<Integer> listToBePrinted, int start, int end) {
		int listSize = listToBePrinted.size();
		
		if (listSize != 0 ) {
			for (int number : listToBePrinted) {
				System.out.printf("%d ", number);
			}
		} else {
			System.out.printf("There are no symmetric numbers in range between %d and %d",
					start, end);
		}
	}
}