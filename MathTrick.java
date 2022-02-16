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
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);

		return max - min;
	}

	// Step 4: Add reversed number to the difference
	public static int diffPlusRev (int num) {
		// Declare and initialize various variables
		int diffPlusRev = 0;
		int difference = 0;
		int reversedNumber = 0;

		// Find the first, last, and middle digits
		int lastDigit = num%10;
		int middleDigit = (int)num/10;
		int firstDigit = num/100;

		// Find the difference
		if (lastDigit > firstDigit) {
			difference = lastDigit - firstDigit;
		}
		else if (firstDigit > lastDigit) {
			difference = firstDigit - lastDigit;
		}
		else {
			difference = lastDigit - firstDigit;
		}

		// Create reversed number using digits
		reversedNumber += lastDigit;
		reversedNumber = (lastDigit * 10) + middleDigit;
		reversedNumber = (reversedNumber * 10) + firstDigit;

		diffPlusRev = reversedNumber + difference;
		return diffPlusRev;
	}
	// Step 5: Multiply the original number by one million
	public static int multipleByMillion(int num) {	
		// Declare and initialize variable
		int million = 0;

		// Multiple the original number by one million
		million = num * 1000000;

		return million;

        }

	
	// Step 6: Subtract by various numbers??? 
	public static int subtractingStuff(int num) {	
		// Declare and initialize variable
		int million = 0;

		// Multiple the original number by one million
		million = num * 1000000;

		// Declare and initialize variable
		int subtractornator = million - 733361573;

		return subtractornator;
        }

	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
		return "";
		// complete the method		
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		return "";
		// complete the method
	}
		
	public static void main(String[] args) 
	{
        //		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int num = getRandomNum();
        //		2.	Now reverse the digits to form a second number.
        int reversed = reverseDigits(num);
        //		3.	Subtract the smaller number from the larger one.
        int difference = difference(num, reversed);
        //		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
		difference += reverseDigits(difference);
        //		5.	Multiply by one million.
        difference *= 1000000;
        //		6.	Subtract 733,361,573.
        difference -= 733361573;
        //		7.	Convert the number to a string in order to replace the numbers with letters.
        // 				Ex: String str = String.valueOf(myNumber);
        //			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String str = String.valueOf(difference);
		String replaced = replaceLtr(str);
		String reversedString = reverseString(replaced);
        //		8.	Now reverse the letters in the string to read your message backward.
		System.out.println(reversedString);
	} // end main
} // end class
