package HomeworkSeven;
import java.util.Scanner;
public class TaskSeven {
    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Ventra ");

        int ventra = input.nextInt();
        int usage=1;

        while(ventra <= 36/usage){
            System.out.println("Usage " + usage);
            usage++;
        }

}}

//In my ventra card, I have an $36. Every usage of the ventra card
//is costing $3. Using while loop print how many times I have used
//the ventra card.
//Example:
//Usage 1
//Usage 2
//Usage 3
//..
//..
//Usage 12