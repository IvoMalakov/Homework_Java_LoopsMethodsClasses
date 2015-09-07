package loopsMethodsClasses;

import java.util.Scanner;

public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your characters and I will form"
				+ " all possible 3 letter words for you");
		String input = scanner.nextLine().trim().toLowerCase();
		
		char[] letters = input.toCharArray();
		
		for (int ch1 = 0; ch1 < letters.length; ch1++) {
			for (int ch2 = 0; ch2 < letters.length; ch2++) {
				for (int ch3 = 0; ch3 < letters.length; ch3++) {
					System.out.printf("" + letters[ch1] + letters[ch2] + letters[ch3] + " " );
				}
			}
		}
	}
}