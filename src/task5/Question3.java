package task5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
	}

}
