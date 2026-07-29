public class Game {

    private String title;
    private String platform;
    private String genre;
    private boolean completed;


    public Game(String title, String platform, String genre) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.completed = false;
    }


    public String getTitle() {
        return title;
    }


    public void completeGame() {
        completed = true;
    }


    public void displayGame() {

        System.out.println(
            "Title: " + title +
            " | Platform: " + platform +
            " | Genre: " + genre +
            " | Completed: " + completed
        );
    }
}
