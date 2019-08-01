import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private List<Team> teams;           // creating a list of teams

    public League(List<Team> teams) {
        this.teams = teams;
    }

    public void play(){
        for (Team team : teams){
            for (Team otherTeam : teams){
                if (team != otherTeam){
                    playMatch(team, otherTeam);
                }
            }
        }
    }

    private void playMatch(Team team, Team otherTeam){
        int teamPerformance = (int) (1.1 * team.teamRating);
        int otherTeamPerformance = otherTeam.teamRating;
        if (teamPerformance > otherTeamPerformance){
            team.wins++;
            otherTeam.losses++;
        } else if (otherTeamPerformance > teamPerformance) {
            otherTeam.wins++;
            team.losses++;
        } else {
            team.draws++;
            otherTeam.draws++;
        }
    }

    public void showResults(){
        Collections.sort(teams);
        System.out.println("\t\tWins\tDraws\t\tLosses\t\tPoints");
        for (Team team : teams){
            System.out.println(team);
        }
    }


}
