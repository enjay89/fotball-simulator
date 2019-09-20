import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeagueTest {

    private static League league;
    private static List<Team> teams;

    @Before
    public void setUp(){
        Player dave = new Player("Dave", 20);
        List<Player> players = new ArrayList<>();
        players.add(dave);
        Team testTeam = new Team("testTeam", players);

        Player steve = new Player("Steve", 38);
        List<Player> players1 = new ArrayList<>();
        players.add(steve);
        Team testTeam1 = new Team ("testTeam1", players1);

        teams = new ArrayList<>();
        teams.add(testTeam);
        teams.add(testTeam1);

        league = new League(teams);
    }

    @Test
    public void testPlay(){

        //GIVEN I have two teams with one player each
        setUp();

        // WHEN the teams play each other
        league.play();

        //THEN each team will have played two games
        Team testTeam = teams.get(0);
        Team testTeam1 = teams.get(1);
        Assert.assertEquals(2, testTeam.wins + testTeam.draws + testTeam.losses);
        Assert.assertEquals(2, testTeam1.wins + testTeam1.draws + testTeam1.losses);
    }

    @Test
    public void testShowResults(){

        //GIVEN I have a league with two teams
        setUp();

        //WHEN I read the results
        String results = league.showResults();

        //THEN they are shown as a league table
        Assert.assertFalse(results.isEmpty());
    }
}
