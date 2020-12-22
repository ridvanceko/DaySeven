package HomeworkSeven;
import java.util.Scanner;
public class TaskSix {
    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number input ");

        int numberInput = input.nextInt();

        int number=0;

        while(number <=10 ){
            System.out.println(number*10);
            number++;
        }


}}

//Write the program to print the numbers between 10 to 100 those
//number will be increased with 10 every time.
//Here is the example output:
//10
//20
//30
//40
//..
//..
//100