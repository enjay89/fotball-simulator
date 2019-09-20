import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TeamTest {

    @Test
    public void testGetPoints() {

        //GIVEN A Team has 2 draws and 1 win

        Team testTeam = new Team("testTeam", new ArrayList<>());
        testTeam.wins = 1;
        testTeam.draws = 2;

        //WHEN we determine the number of points
        int points = testTeam.getPoints();

        //THEN the team has 5 points
        Assert.assertEquals(5, points);   // expected / actual

    }
}
