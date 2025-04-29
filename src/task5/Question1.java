package task5;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "malayalam"; 
        boolean isPalindrome = true;

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

	}

}
