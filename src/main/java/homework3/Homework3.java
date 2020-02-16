package homework3;

import java.text.MessageFormat;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String [][]scedule= new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1]="do home work";
        scedule[1][0]="Monday";
        scedule[1][1]="go to course; watch a film";

        Scanner scanner= new Scanner(System.in);
        while(true) {
            System.out.println("Please, input the day of the week:");
            String weekday =scanner.nextLine();
            switch (weekday.toLowerCase().trim()) {
                case "monday":
                    System.out.println("Your tasks for " + scedule[1][0] + " :" + scedule[1][1]);
                    break;
                case "sunday":
                    System.out.println("Your tasks for " + scedule[0][0] + " :" + scedule[0][1]);
                    break;
                case "exit":
                   break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }
        }

    }


}
