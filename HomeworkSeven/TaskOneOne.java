package HomeworkSeven;

import java.util.Scanner;

public class TaskOneOne {

    public static void main (String [] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter month ");
        int month = input.nextInt();

        System.out.println("Please enter year ");
        int year = input.nextInt();

        if(month==1)
            System.out.println("January " + year + "has 31 days");
        else if (month==3)System.out.println("March " + " has 31 days");
        else if (month==4)System.out.println("April " + " has 31 days");
        else if (month==5)System.out.println("May " + " has 31 days");
        else if (month==6)System.out.println("June " + " has 31 days");
        else if (month==7)System.out.println("July " + " has 31 days");
        else if (month==8)System.out.println("August " + " has 31 days");
        else if (month==9)System.out.println("September " + " has 31 days");
        else if (month==10)System.out.println("October " + " has 31 days");
        else if (month==11)System.out.println("November " + " has 31 days");
        else if (month==12)System.out.println("December " + " has 31 days");
        else if (month==2){
            //if ((year%4 == 0 && year%100 !=0) || (year%400 )
        }



    }}




//Using scanner ask user to input the month number and year
//number. Then print the number of the days in a month.
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days