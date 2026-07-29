import java.util.ArrayList;


public class GameLibrary {

    private ArrayList<Game> games;


    public GameLibrary() {
        games = new ArrayList<>();
    }


    public void addGame(Game game) {
        games.add(game);
    }


    public void displayGames() {

        if(games.isEmpty()) {
            System.out.println("No games in library.");
            return;
        }


        for(Game game : games) {
            game.displayGame();
        }
    }


    public void searchGame(String title) {

        for(Game game : games) {

            if(game.getTitle()
                    .equalsIgnoreCase(title)) {

                game.displayGame();
                return;
            }
        }

        System.out.println("Game not found.");
    }
}
