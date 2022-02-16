/**
 * This program is written for the FLVS AP CS A 4.07 Challenge Program. 
 * It is intended to perform a few "math tricks" by calling different methods.
 * 
 * @author Dakota Marosi
 * @version 02/14/2022
 *
 */


public class MathTrick {
	// Step 1: Generate a pseudorandom 3 digit number so that the 1st
 	// and 3rd digits aren't the same number
	public static int getRandomNum() {	
		// Declare and intialize variables
		int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;
		
		// Create number
		num = (int)(Math.random() * (898) + 100);
		
		// Find the last digit
		lastDigit = num%10;
		
		// Find the first digit
		firstDigit = num/100;
        
		// While loop that ensures 
		while (firstDigit == lastDigit) {
		    num = (int)(Math.random() * (898) + 100);
            }
	
		return num;
        }

	// Step 2: Reverse the digits of the number
	public static int reverseDigits (int num) {
		// Declare and initialize the number in reverse
		int reversedNumber = 0;

		// Find the last digit
		int lastDigit = num%10;
		
		// Find the first digit
		int firstDigit = num/100;

		// Find the middle digit
		int middleDigit = (int)num/10;

		// Create reversed number using digits
		reversedNumber += lastDigit;
		reversedNumber = (lastDigit * 10) + middleDigit;
		reversedNumber = (reversedNumber * 10) + firstDigit;

		return reversedNumber;
		
	}
	
	// Step 3: Find the difference between the larger and smaller number
	public static int difference(int num1, int num2) {
		// Declare variables that determine min and max
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);

		return max - min;
	}
	
	// Step 7: replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLetter(String str)
	{
		String zero = "Y";
		String one = "M";
		String two = "P";
		String three = "L";
		String four = "R";
		String five = "O";
		String six = "F";
		String sevne = "A";
		String eight = "I";
		String nine = "B";
		
		int length = str.length();
		int counter = 0;

		while (counter < length) {
			
		}


		return "";
		// complete the method		
	}
	
	// Step 8: reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		return "";
		// complete the method
	}
		
	public static void main(String[] args) 
	{
		System.out.println("****************************************");
		System.out.println("Math Trick Machine")

        //	1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int num = getRandomNum();
		System.out.println("1. The starting number: " + num);

        //	2.	Now reverse the digits to form a second number.
        int reversed = reverseDigits(num);
		System.out.println("2. The reversed number: " + reversed);

        //	3.	Subtract the smaller number from the larger one.
        int difference = difference(num, reversed);
		System.out.println("3. The difference of these two numbers: " + difference);

        //	4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
		difference += reverseDigits(difference);
		System.out.println("4. The reversed number added to the difference: " + difference);

        //	5.	Multiply by one million.
        difference *= 1000000;
		System.out.println("5. That number multipled by a million: " + difference);

        //	6.	Subtract 733,361,573.
        difference -= 733361573;
		System.out.println("6. The difference subtracted by 733,361,573: " + difference);

        //	7.	Convert the number to a string in order to replace the numbers with letters.
        //	Then, replace each of the digits in your answer, with the letter it corresponds 
		//  to using the table in the instructions.
        String str = String.valueOf(difference);
		String replaced = replaceLetter(str);

        //	8.	Now reverse the letters in the string to read your message backward.
		String reversedString = reverseString(replaced);

	} 
} 
