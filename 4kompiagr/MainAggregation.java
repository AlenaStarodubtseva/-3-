public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Иван");
        Player player2 = new Player("Алексей");

        Team team = new Team();
        team.addPlayer(player1);
        team.addPlayer(player2);

        team.showTeam();

        // Игроки существуют и без команды
        System.out.println("Игрок вне команды: " + player1.getName());
    }
}
