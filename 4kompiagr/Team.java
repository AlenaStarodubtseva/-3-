import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players; // Агрегация: команда имеет список игроков

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void showTeam() {
        System.out.println("Команда состоит из:");
        for (Player player : players) {
            System.out.println("- " + player.getName());
        }
    }
}
