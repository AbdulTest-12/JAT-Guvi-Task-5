package task5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int month = scanner.nextInt(); // Month
	        float rentPerDay = scanner.nextFloat(); // Rent per day
	        int numberOfDays = scanner.nextInt(); // Number of days stayed

	        boolean isPeakSeason = false;

	        switch (month) {
	            case 4: case 5: case 6: // April to June
	            case 11: case 12: // November, December
	                isPeakSeason = true;
	                break;
	            default:
	                isPeakSeason = false;
	        }

	        float totalTariff;
	        if (isPeakSeason) {
	            totalTariff = rentPerDay * numberOfDays * 1.2f;
	        } else {
	            totalTariff = rentPerDay * numberOfDays;
	        }

	        System.out.printf("%.2f\n", totalTariff);

	        scanner.close();
	}

}
