package loopsMethodsClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of hands and I will generate them for you");
		int number = scanner.nextInt();
		
		String[] faces = {
							"2", 
							"3", 
							"4",
							"5", 
							"6", 
							"7", 
							"8", 
							"9", 
							"10",
							"J",
							"Q",
							"K",
							"A"
						};

		char[] suits = {
							'\u2660', 
							'\u2665',
							'\u2666',
							'\u2663'
						};
		
		for (int i = 0; i < number; i++) {
				System.out.println(createAHand(faces, suits));
		}
	}
	
	private static String createAHand(String[] faces, char[] suits) {
		StringBuilder hand = new StringBuilder();
		final int NumberOfCards = 5;
		
		for (int i = 0; i < NumberOfCards; i++) {
			hand.append(faces[generateRandomFaceNumber(faces)] + suits[generateRandomSuitNumber(suits)] + " ");
		}
		
		return hand.toString();
	}
	
	private static int generateRandomFaceNumber(String[] faces) {
		Random random = new Random();
		int size = faces.length;
		
		return random.nextInt(size);
	}
	
	private static int generateRandomSuitNumber(char[] suits) {
		Random random = new Random();
		int size = suits.length;
		
		return random.nextInt(size);
	}
}