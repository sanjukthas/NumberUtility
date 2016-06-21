package code1;

/*
 * PalindromeTester.java
 * 
 * Tests a string as entered by the user 
 * to see whether or not it is a palindrome or not.
 * A palindrome would be the same string forwards 
 * as it is backwards.
 * Examples: Anna, civic and of, course:
 * A man a plan a canal Panama.
 */
import java.util.*;

public class code1 {
 public static void main(String[] args) {
 // The palindrome will be entered by the user at the keyboard
 Scanner in = new Scanner(System.in);
 
 System.out.println("Palindrome Checker");
 System.out.print("What phrase would you like to check? ");
 String original = in.nextLine();
 
 // Convert to lower case to simplify comparing strings
 String phrase = original.toLowerCase().replaceAll(" ", "").replaceAll(",", ""); 
 
 String backwards = ""; 
 
 // loop through the string backwards, starting with the last character
 for (int i = phrase.length() - 1; i >= 0; i--) {
 
 // Extract each letter as the next character 
 // and build the backwards string
 String letter = phrase.substring(i, i + 1);
 backwards += letter;
 } 
 
 // A palindrome is a word or phrase that is the same forward or 
 // backward. This is where we check that.
 if (phrase.equals(backwards)) {
 System.out.println(original + " is a palindrome!");
 System.out.println(phrase);
 } else {
 System.out.println(original + " is not a palindrome!"); 
 System.out.println(phrase);
 }
 
 }
}