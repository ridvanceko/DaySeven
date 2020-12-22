package HomeworkSeven;
import java.util.Scanner;
public class TaskFive {

    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a input value ");

        char letter = input.next().charAt(0);

        int charValue = letter;
        System.out.println(charValue);
        String letter1 = Character.toString(letter);

        if(letter1.length()>1) {
            System.out.println("Error!");

        }else if (letter1.length()==1) {

            if (charValue > 64 && charValue < 123) {
                System.out.println("This is a letter ");

            }else if(charValue >= 48 && charValue <=57) {
                System.out.println("This is a number ");
            }
        }}}

//Write the program to check whether a character is an alphabet,
//digit or special character. NOTE: you can use the ascii numbers to
//check the value of the character.
//Test Data :
//@
//Expected Output :
//This is a special character