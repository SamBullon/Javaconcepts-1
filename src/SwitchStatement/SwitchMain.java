package SwitchStatement;

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        System.out.println("Enter a day Index");
        //create a scanner object
        Scanner dayScanner = new Scanner(System.in);
        //take in param n store it in variable
        int indexedDay = dayScanner.nextInt();
        //we create the condition that will affect the indexedDay
        if (indexedDay == 1){
            System.out.println("First day is Sunday");
        }else if (indexedDay == 2){
            System.out.println(" 2nd day is Monday");
        }else if (indexedDay == 3){
            System.out.println("3rd day is Tuesday");
        }else if (indexedDay == 4){
            System.out.println("4th day is Wednesday");
        }else if (indexedDay == 5){
            System.out.println("5th day is Thursday");
        }else if (indexedDay == 6) {
            System.out.println("6th day is Thursday");
        }else if (indexedDay == 7) {
            System.out.println("7th day is Thursday");
        }
        else {
            System.out.println("There can be only 7 days in a week");
        }
    }
}
