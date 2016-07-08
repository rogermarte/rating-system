package es.rogermartinez.ratingsystem;

/**
 * Created by roger on 10/6/16.
 */
public interface RatingSystem {
    double calculateRating(Team team1, Team team2, MatchResult result);
}
