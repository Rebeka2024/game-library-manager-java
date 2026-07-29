import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        GameLibrary library = new GameLibrary();


        library.addGame(
            new Game(
                "Hogwarts Legacy",
                "PlayStation 5",
                "RPG"
            )
        );


        library.addGame(
            new Game(
                "Cyberpunk 2077",
                "PC",
                "Action RPG"
            )
        );


        while(true) {


            System.out.println("\n🎮 Game Library Manager");

            System.out.println("1. View Games");
            System.out.println("2. Add Game");
            System.out.println("3. Search Game");
            System.out.println("4. Exit");


            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();



            if(choice == 1) {

                library.displayGames();

            }


            else if(choice == 2) {

                System.out.print("Game title: ");
                String title = scanner.nextLine();


                System.out.print("Platform: ");
                String platform = scanner.nextLine();


                System.out.print("Genre: ");
                String genre = scanner.nextLine();


                library.addGame(
                    new Game(title, platform, genre)
                );


                System.out.println("Game added!");

            }


            else if(choice == 3) {

                System.out.print("Search title: ");

                String search = scanner.nextLine();

                library.searchGame(search);

            }


            else if(choice == 4) {

                System.out.println("Thanks for using Game Library Manager!");
                break;

            }


            else {

                System.out.println("Invalid option.");

            }
        }


        scanner.close();

    }
}
