package loopsMethodsClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the beginning date and the end date of your periode");
		String begin = scanner.nextLine();
		String end = scanner.nextLine();
		
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			Date startDate = date.parse(begin);
			Date endDate = date.parse(end);
			System.out.println(calculateDiffrenceInDays(startDate, endDate));
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
	}
	
	private static long calculateDiffrenceInDays(Date startDate, Date endDate) {
		long diffrence = endDate.getTime() - startDate.getTime();
		return TimeUnit.DAYS.convert(diffrence, TimeUnit.MILLISECONDS);
	}
}