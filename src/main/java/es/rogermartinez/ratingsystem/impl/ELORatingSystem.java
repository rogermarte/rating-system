package es.rogermartinez.ratingsystem.impl;

import es.rogermartinez.ratingsystem.RatingSystem;
import es.rogermartinez.ratingsystem.Team;

public class ELORatingSystem implements RatingSystem {
    public double calculateRating(Team team1, Team team2) {
        //double estimate = 0.5f;
        double diferential = team2.getScore() - team1.getScore();
        double diferential400Fraction = diferential / 400;
        double potencia = Math.pow(10, diferential400Fraction);
        double divider = 1 + potencia;
        return 1/divider;
    }
}
