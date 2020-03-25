package homework3;

import java.text.MessageFormat;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String [][]scedule= {
                {"Sunday","do homework"},
                {"Monday","go to course", "match the film"},
                {"Tuesday","play tennis with Peter"},
                {"Wednesday","start on learning Spanish"},
                {"Thursday","finish the powerpoint for economics class"},
                {"Friday","do homework"},
                {"Saturday","realize that tomorrow is monday"}
        };

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
                case "tuesday":
                        System.out.println("Your tasks for "+scedule[2][0]+" :"+ scedule[2][1]);
                        break;
                case "wednesday":
                    System.out.println("Your tasks for "+scedule[3][0]+" :"+ scedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for "+scedule[4][0]+" :"+ scedule[4][1]);
                    break;
                case "friday" :
                    System.out.println("Your tasks for "+scedule[5][0]+" :"+ scedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for "+scedule[6][0]+" :"+ scedule[6][1]);
                    break;
                case "exit":
                   break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }
        }

    }


}
