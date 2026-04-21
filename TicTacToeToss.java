import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class TicTacToeToss {
    public static void main(String[] args) {
        Random random = new Random();
        
        int tossResult = random.nextInt(2);
        
        String startingPlayer;
        Map<String, String> playerSymbols = new HashMap<>();
        
        if (tossResult == 0) {
            startingPlayer = "Player 1";
            playerSymbols.put("Player 1", "X");
            playerSymbols.put("Player 2", "O");
        } else {
            startingPlayer = "Player 2";
            playerSymbols.put("Player 1", "O");
            playerSymbols.put("Player 2", "X");
        }
        
        System.out.println("Toss Result: " + startingPlayer + " wins the toss!");
        System.out.println("Assignments:");
        System.out.println("Player 1 Symbol: " + playerSymbols.get("Player 1"));
        System.out.println("Player 2 Symbol: " + playerSymbols.get("Player 2"));
        System.out.println("\n" + startingPlayer + " will take the first turn.");
    }
}