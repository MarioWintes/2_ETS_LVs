package lv2_comparator.number_guesser;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) throws NotANumberException {

        // Zahl twischen inkl. 0 und excl. 10
        int randInt = new Random().nextInt(10);

        // init input = -1
        int input = -1;

        Scanner scanner = new Scanner(System.in);


        while (input != randInt){
            System.out.println("Gib eine Zahl ein:");
            String userInput = scanner.next();

            parseInput(userInput);

            if (input != randInt){
                System.out.println("Leider nein. Nochmal.");
            }
        }
        System.out.println("Super Zahl erraten.");
    }

    private static int parseInput(String userInput) throws NotANumberException{
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new NotANumberException("Keine Nummer eingegeben", e);
        }
    }

}
