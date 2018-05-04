package com.drpicox.bowlingKata;

public class Game {
    private int score = 0;
    public void roll(int points) {
        score += points;
    }

    public int score() {
        return score;
    }
}
