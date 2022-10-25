import java.util.Scanner;

// description: user panel with all the functionalities needed by the user to
// display all the items and search for an specific item and
// add, buy or remove items to/from his cart.

// OOP principals applied: encapsulation appears in the objects created with private modifiers.

public class User
{
    //stock list and order list as parameters for the constructor.

    private static final Scanner scanner = new Scanner(System.in);
    private final stockList stock;
    private final Order order;

    public User(stockList stock, Order order)
    {
        this.stock = stock;
        this.order = order;
    }

    // printInstructions function is used to print all
    // functionalities available for the user.

    private void printInstructions()
    {
        System.out.println("------------------------------------------");
        System.out.println("User Panel");
        System.out.println("------------------------------------------");
        System.out.println("0 - to print choice options:");
        System.out.println("1 - to display all items in stock:");
        System.out.println("2 - to search for a song in the stock:");
        System.out.println("3 - create order:");
        System.out.println("4 - to logout:");
        System.out.println("------------------------------------------\n");
    }

    // User panel with switch cases to use all the functions.

    public int userPanel()
    {
        Scanner scanner = new Scanner(System.in);



        int choice;
        int innerChoice;
        while (true)
        {
            printInstructions();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("------------------------------------------");

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println("1- track");
                    System.out.println("2- piano");
                    System.out.println("3- drums");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = scanner.nextInt();
                    scanner.nextLine();
                    if(innerChoice == 1) {
                        stock.displayAllSongs();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        stock.displayAllPiano();
                        System.out.println("------------------------------------------");
                    }
                    else if(innerChoice == 3)
                    {
                        stock.displayAllDrums();
                    }
                    break;
                case 2:
                    searchSong();
                    System.out.println("------------------------------------------");
                    break;
                case 3:
                    order.createOrder();
                    System.out.println("------------------------------------------");
                    break;
                case 4:

                    System.out.println("------------------------------------------");
                    return  -1;

            }
        }

    }

    // searchSong function is created to search for a specific song using the stock list
    // search function such as search by title, artist or category.

    private void searchSong()
    {
        System.out.println("------------------------------------------");
        System.out.println("1 - to search song by title:");
        System.out.println("2 - to search song by artist:");
        System.out.println("3 - to search song by category:");
        System.out.println("------------------------------------------");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("------------------------------------------");
        switch (choice)
        {
            case 1:
                System.out.println("Enter the name of the song you are looking for:");
                String TrackName = scanner.nextLine();
                stock.searchSongByName(TrackName);
                break;
            case 2:
                System.out.println("Enter the artist of the song you are looking for: ");
                String ArtistName = scanner.nextLine();
                stock.searchSongByArtist(ArtistName);
                break;
            case 3:
                System.out.println("Enter the category of the song you are looking for:");
                String Category = scanner.nextLine();
                stock.searchSongByCategory(Category);
                break;
        }

    }

}
