
import java.lang.invoke.VarHandle.AccessMode;
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("", 0);
      System.out.println(repeated);
      String pyramid = createPyramid(0);
      String FizzBuzz = countTo(3);
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        
        int amountCounter = 0;
        String output = "";

        while (amountCounter < times) {
            amountCounter = amountCounter + 1;
            output = output + (word + " ");

            if (amountCounter == times) { // Breaks the loop and returns the output. .trim() removes any trailing spaces in the string
                return (output.trim());
                }
            }

        return "";
        }
        

         
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        // TODO: Implement this method
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines

        int amountCounter = 0;
        String pyramid = "";

        while (amountCounter < maxNumber) {
            amountCounter = amountCounter + 1; 
            String number = Integer.toString(amountCounter); // Makes a copy of amount counter, but as a string
            pyramid = pyramid + ("\n" + number.repeat(amountCounter));

            if (amountCounter == maxNumber) { //Stops the loop when , and returns the output
                return pyramid;
                }   
        }
        return "";
    }
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end
        return " Ignore this #3";
    }
    
  
}