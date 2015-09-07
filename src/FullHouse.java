package loopsMethodsClasses;

import java.util.Scanner;

public class FullHouse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
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
		
		int countOfFullHouses = 0;
		int suitSize = suits.length;
		int facesSize = faces.length;
		
		for (int suit1 = 0; suit1 < suitSize; suit1++) {
			for (int suit2 = suit1 + 1; suit2 < suitSize; suit2++) {
				for (int suit3 = suit2 + 1; suit3 < suitSize; suit3++) {
					for (int suit1Second = 0; suit1Second < suitSize; suit1Second++) {
						for (int suit2Second = suit1Second + 1; suit2Second < suitSize; suit2Second++) {
							for (int faceFirst = 0; faceFirst < facesSize; faceFirst++) {
								for (int faceSecond = 0; faceSecond < facesSize; faceSecond++) {
									if (faceFirst != faceSecond) {
										StringBuilder output = new StringBuilder();
										output.append(
												"(" + faces[faceFirst] + suits[suit1] + " " +
												faces[faceFirst] + suits[suit2] + " " +
												faces[faceFirst] + suits[suit3] + " " +
												faces[faceSecond] + suits[suit1Second] + " " +
												faces[faceSecond] + suits[suit2Second] + ")"
													);
										System.out.println(output);
										countOfFullHouses++;
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.printf("%d full houses", countOfFullHouses);
	}
}