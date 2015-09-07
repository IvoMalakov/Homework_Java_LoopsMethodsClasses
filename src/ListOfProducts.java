package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts {

	public static void main(String[] args) throws IOException {
		ArrayList <Product> products = new ArrayList<Product>();
		
		String inputFile = "D:\\Ivo\\kurs po programirane\\nivo 1 - Fundamental Level\\"
				+ "Java Basic - September 2015\\domashno 3 - Cikli, Metodi i Klasove\\"
				+ "Homework_LoopsMethodsClasses\\src\\loopsMethodsClasses\\Input_Products.txt";
		
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		try {
			
			while (true) {
				String line = bufferedReader.readLine();
				
				if (line == null) {
					break;
				}
				
				String[] productElement = line.split(" ");
				String name = productElement[0];
				double price = Double.parseDouble(productElement[1]);
				products.add(new Product(name, price));
				System.out.println(line);
			}
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			fileReader.close();
			bufferedReader.close();
		}
		
		Collections.sort(products);
		printOutputInformation(products);
	}
	
	private static void printOutputInformation(ArrayList<Product> productList) {
		String outputFile = "D:\\Ivo\\kurs po programirane\\nivo 1 - Fundamental Level\\"
				+ "Java Basic - September 2015\\domashno 3 - Cikli, Metodi i Klasove\\"
				+ "Homework_LoopsMethodsClasses\\src\\loopsMethodsClasses\\Output_Products.txt";
		
		try (PrintWriter writer = new PrintWriter(outputFile)) {
			for (Product product : productList) {
				writer.println(product);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}