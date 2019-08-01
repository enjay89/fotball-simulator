import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Player> swindonPlayers = new ArrayList<>();            // new ArrayList CALLS the Array List constructor so needs ():
        swindonPlayers.add(new Player("Scorey Goalerson", 27));
        swindonPlayers.add(new Player("Passy Ballerson", 32));
        swindonPlayers.add(new Player("Slidey Tacklerson", 28));
        swindonPlayers.add(new Player("Stoppy McShots", 25));
        Team swindon = new Team("Swindon", swindonPlayers);

        List<Player> readingPlayers = new ArrayList<>();
        readingPlayers.add(new Player("Barndoor McBanjo", 32));
        readingPlayers.add(new Player("Useless von Terrible", 32));
        readingPlayers.add(new Player("Steve Donkey", 28));
        readingPlayers.add(new Player("John Butterfingers", 25));
        Team reading = new Team("Reading", readingPlayers);

        List<Player> bristolPlayers = new ArrayList<>();
        bristolPlayers.add(new Player("Booker T Report", 23));
        bristolPlayers.add(new Player("Cosine Tangent", 29));
        bristolPlayers.add(new Player("Email", 42));
        bristolPlayers.add(new Player("Kyle Database", 25));
        Team bristol = new Team("Bristol", bristolPlayers);

        List<Player> oxfordPlayers = new ArrayList<>();
        oxfordPlayers.add(new Player("Brian B'stard", 31));
        oxfordPlayers.add(new Player("Timmy Toothless", 69));
        oxfordPlayers.add(new Player("Johnny Nolegs", 28));
        oxfordPlayers.add(new Player("Franky Fumble", 56));
        Team oxford = new Team("Oxford", oxfordPlayers);

        List<Team> teams = new ArrayList<>();
        teams.add(swindon);
        teams.add(reading);
        teams.add(bristol);
        teams.add(oxford);

        League league = new League(teams);
        league.play();
        league.showResults();
    }
}
