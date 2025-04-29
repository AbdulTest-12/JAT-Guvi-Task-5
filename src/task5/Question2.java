package task5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize an empty string to hold the reversed result
        String reversed = "";

        // Loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
	}

}
