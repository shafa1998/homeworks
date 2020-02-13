package homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void printDeck(String[][] deck){
        System.out.println("  12345");
        for (int i = 0; i < deck.length; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < deck[i].length; j++) {
                System.out.print(deck[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String [][] deck= new String [5][5];

        for (int y = 0; y < deck.length; y++) {
            for (int x = 0; x < deck[y].length; x++) {
                deck[y][x]="-";
            }
        }

        Random generator = new Random();
        int line=generator.nextInt(5);
        int column=generator.nextInt(5);
        Scanner choose = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        printDeck(deck);
        while (true){
            System.out.println("Please enter line coordinate");
            int userLine = choose.nextInt();
            System.out.println("Please enter column coordinate");
            int userColumn = choose.nextInt();
            if (userLine>0 && userLine<=5 && userColumn>0 && userColumn<=5){
                if(userLine-1==line && userColumn-1==column){
                    deck[userLine-1][userColumn-1]="x";
                    printDeck(deck);
                    break;
                }
                else {
                    deck[userLine-1][userColumn-1] = "*";
                    printDeck(deck);
                }
            }
            else
                System.out.println("Enter number in [1,5] range");
        }
    }
}

