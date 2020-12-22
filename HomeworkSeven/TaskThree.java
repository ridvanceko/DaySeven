package HomeworkSeven;

import java.util.Scanner;

public class TaskThree {
    public static void main (System [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature ");
        int temperature = input.nextInt();

        if(temperature<0 )  System.out.println("Freezing weather ");
        else if (temperature>0 && temperature<10) System.out.println("Very cold weather ");
        else if (temperature>10 && temperature<20) System.out.println("Cold weather ");
        else if (temperature>20 && temperature<30) System.out.println("Normal in temperature ");
        else if (temperature>30 && temperature<40) System.out.println("It is hot ");
        else if (temperature>40) System.out.println("Very HOT ");




}}

//Write to code to read temperature in centigrade and display a
//suitable message according to temperature state below :
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot
//Test Data :42
//Expected Output :Its very hot.