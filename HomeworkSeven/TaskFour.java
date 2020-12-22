package HomeworkSeven;
import java.util.Scanner;

public class TaskFour {

    public static void main (String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("First angle? ");
        int first = input.nextInt();
        System.out.println("Second angle? ");
        int second = input.nextInt();
        System.out.println("Third angle? ");
        int third = input.nextInt();

        if(first + second + third == 180) {
            if(first == second && first == third) {
                System.out.println("This is an Equilateral triangle ");
            }else if (first == second || second == third)
                System.out.println("This is Isosceles ");
            else System.out.println("This is Scalene");
        } else System.out.println("Total number must be 180 ");

}}


//Write the program to check whether a triangle is Equilateral,
//Isosceles or Scalene.
//Test Data :50 50 60
//Expected Output :This is an isosceles triangle.
//Equilateral: an equilateral triangle is a triangle in which all three
//sides have the same length
//Isosceles: an isosceles triangle is a triangle that has two sides of
//equal length.
//Scalene: of a triangle having all sides unequal in length.