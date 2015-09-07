package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromATextFile {

	public static void main(String[] args) throws IOException {
		String inputFile = "D:\\Ivo\\kurs po programirane\\nivo 1 - Fundamental Level\\"
				+ "Java Basic - September 2015\\domashno 3 - Cikli, Metodi i Klasove\\"
				+ "Homework_LoopsMethodsClasses\\src\\loopsMethodsClasses\\Input.txt";
		
		System.out.printf("I will sum the numbers from the file \"%s\" !\n", inputFile);
		
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		try {		
				int sum = 0;
			
				while (true) {
					String line = bufferedReader.readLine();
					
					if (line == null) {
						break;
					}
					
					int number = Integer.parseInt(line);
					sum += number;
				}
			
			System.out.printf("Result: %d", sum);
			
		} catch (IOException ioex) {
			System.err.printf("I can not read this file %s", inputFile);
			ioex.printStackTrace();
			
		} finally {
			bufferedReader.close();
			fileReader.close();
		}
	}
}