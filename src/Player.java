import java.util.Random;

public class Player {

    String playerName;
    int playerRating;                // to create a random rating for the player, rather than manually assigning
    int playerAge;                   // Maybe make a players rating decrease as he gets old?

    public Player (String playerName, int playerAge) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerRating = new Random().nextInt(10);
        playerRating += 1;
        if (playerAge > 30) {
            playerRating--;
        }
        if (playerAge > 32) {
            playerRating--;
        }
        if (playerAge > 34) {
            playerRating--;
        }
        if (playerAge > 40) {
            playerRating--;
        }
    }

}

