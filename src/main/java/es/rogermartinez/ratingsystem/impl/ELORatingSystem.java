package es.rogermartinez.ratingsystem.impl;

import es.rogermartinez.ratingsystem.MatchResult;
import es.rogermartinez.ratingsystem.RatingSystem;
import es.rogermartinez.ratingsystem.Team;

public class ELORatingSystem implements RatingSystem {

    private int factorK;

    public ELORatingSystem (){
        this.factorK = 32;
    }

    public ELORatingSystem (int factorK) {
        this.factorK = factorK;
    }

    public double calculateRating(Team teamToCalculateRating, Team versusTeam, MatchResult result) {
        double estimateTeam1 = calculateEstimateRating(teamToCalculateRating, versusTeam);
        return teamToCalculateRating.getScore() + (factorK * (result.getResult() - estimateTeam1));

    }

    double calculateEstimateRating(Team teamToEstimate, Team versusTeam) {
        double diferential = versusTeam.getScore() - teamToEstimate.getScore();
        double diferential400Fraction = diferential / 400;
        double potencia = Math.pow(10, diferential400Fraction);
        double divider = 1 + potencia;
        return 1/divider;
    }
}
