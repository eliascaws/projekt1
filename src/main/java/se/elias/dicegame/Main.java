package se.elias.dicegame;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rounds = 2;

        System.out.println("Välkommen till tärningsspelet");

        System.out.println("Spelare #1 var vänlig och skriv ditt namn:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Spelare #2 var vänlig och skriv ditt namn:");
        Player player2 = new Player(scanner.nextLine());


        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRunda: " + i);


            System.out.println(player1.getName() + ", vänligen tryck retur för at rulla tärningen!");
            scanner.nextLine();
            player1.rollDice(random);

            System.out.println(player2.getName() + ", vänligen tryck retur för at rulla tärningen!");
            scanner.nextLine();
            player2.rollDice(random);

            System.out.println("\nResultatet för runda " + i + ":");
            System.out.println(player1.getName() + "- poäng för rundan: " + player1.getRoundScore() + " | Total poäng: " + player1.getTotalScore());
            System.out.println(player2.getName() + "- poäng för rundan: " + player2.getRoundScore() + " | Total poäng: " + player2.getTotalScore());

        }
        System.out.println("\nSlutgiltiga poäng:");
        System.out.println(player1.getName() + ": " + player1.getTotalScore());
        System.out.println(player2.getName() + ": " + player2.getTotalScore());

        if (player1.getTotalScore() > player2.getTotalScore()) {
            System.out.println(player1.getName() + " är matchens vinnare!");
        } else if (player2.getTotalScore() > player1.getTotalScore()) {
            System.out.println(player2.getName() + " är matchens vinnare!");
        } else {
            System.out.println("Matchen slutade lika!");
        }

        scanner.close();
    }
}