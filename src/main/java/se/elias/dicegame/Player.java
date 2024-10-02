package se.elias.dicegame;

import java.util.Random;


public class Player { // begins the player class

    private String name; // stores the player name
    private int roundScore; // stores the players current round score
    private int totalScore; // stores the players current total score

    public Player(String name) { // creates the player object
        this.name = name; // sets name of the player object
        this.roundScore = 0; // sets the round score of the player object
        this.totalScore = 0;// sets the total score of the player object
    }

    public String getName() {
        return name;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
    public void rollDice(Random random){
        roundScore = random.nextInt(6) + 1;
        System.out.println(name + " rullade " + roundScore);
        totalScore += roundScore;

    }








}
