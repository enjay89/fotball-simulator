import java.util.List;

public class Team implements Comparable<Team>{

    String teamName;
    int teamRating;
    List<Player> players;
    int wins;
    int draws;
    int losses;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;


        int totalScore = 0;
        for (Player player : players) {
            totalScore += player.playerRating;
        }
        this.teamRating = totalScore;
    }

    public int getPoints() {
        return wins * 3 + draws;
    }

    @Override
    public String toString(){
        return teamName + "\t" + wins + "\t\t" + draws + "\t\t\t" + losses + "\t\t\t" + getPoints();
    }

    @Override
    public int compareTo(Team otherTeam) {
        if (otherTeam.getPoints() > getPoints()) {
            return 1;
        } else if (getPoints() > otherTeam.getPoints()) {
            return -1;
        }
        return 0;
    }
}
