package homework1;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Random chooseNumber = new Random();
        int number1 = chooseNumber.nextInt(100);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please,enter name");
        String name = userInput.nextLine();
        System.out.println("Let the game begin!");
        while (true) {
            int number2 = userInput.nextInt();
            if (number2 < number1) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (number2 > number1) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + " !");
                break;
            }
        }
    }
}