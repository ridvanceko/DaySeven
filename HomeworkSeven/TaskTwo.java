package HomeworkSeven;
import java.util.Scanner;

public class TaskTwo {
    public static void main (System [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("write a letter ");

        char letter = input.next().charAt(0);

        int charValue = letter;
        System.out.println(charValue);
        String letter1 = Character.toString(letter);

        if(letter1.length()>1) {
            System.out.println("Error!");

        }else if (letter1.length()==1) {

            if (charValue > 64 || charValue < 80 || charValue > 95 || charValue < 123) {


                if (letter1.equalsIgnoreCase("A") ||
                        letter1.equalsIgnoreCase("E") ||
                        letter1.equalsIgnoreCase("I") ||
                        letter1.equalsIgnoreCase("O") ||
                        letter1.equalsIgnoreCase("U")) {
                    System.out.println("this is vowel ");
                } else System.out.println("this is consonant");
            }

        }}}


//Write a Java program that takes the user to provide a single
//character from the alphabet. Print Vowel or Consonant,
//depending on the user input. If the user input is not a letter
//(between a and z or A and Z), or is a string of length > 1, print an
//error message.
//Input an alphabet:
//p
//Expected Output :
//Input letter is Consonant