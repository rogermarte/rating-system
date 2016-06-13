package es.rogermartinez.ratingsystem.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.List;

import es.rogermartinez.ratingsystem.Player;
import es.rogermartinez.ratingsystem.RatingSystem;
import es.rogermartinez.ratingsystem.Team;

/**
 * Created by roger on 10/6/16.
 */
public class ELORatingSystemTest {

    ELORatingSystem eloRatingSystem = new ELORatingSystem();

    @Test
    public void should_when_blah() {
        Team team1 = createTeamWith1000Score();
        Team team2 = createTeamWith1000Score();

        double score = eloRatingSystem.calculateRating(team1, team2);


        Assert.assertEquals(score, 0.5d, 0);
    }

    private Team createTeamWith1000Score() {
        Team team = new Team() {
            @Override
            public List<Player> getPlayers() {
                return null;
            }

            @Override
            public float getScore() {
                return 1000;
            }
        };
        return team;
    }
}