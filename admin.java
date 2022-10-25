import java.util.Scanner;

// description: admin panel with all the functionalities needed by the admin to
// control the stock and manage the accounts.

// OOP principals applied: encapsulation appears in the objects
// created as private objects.

public class admin
{
    // creating an object from the StockList in order to apply our functions
    // and logAndReg object in order to create the login and register system.

    private static final Scanner scanner = new Scanner(System.in);
    private static final stockList admin1 = new stockList();
    private static final LogAndReg l = new LogAndReg();

    // admin panel with switch cases to use all the functions.

    public  int adminPanel()
    {
        Scanner scanner = new Scanner(System.in);



        int choice;
        int innerChoice;
        int inChoice;

        while (true)
        {
            printInstructionsV2();
            System.out.println("Enter your choice: ");
            choice = checkChoice(scanner);
            scanner.nextLine();
            System.out.println("------------------------------------------");

            switch (choice)
            {
                case 0:
                    printInstructionsV2();
                    break;

                case 1:
                    System.out.println("1- track");
                    System.out.println("2- instruments");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = checkChoice(scanner);
                    scanner.nextLine();
                    System.out.println("------------------------------------------");
                    if(innerChoice == 1) {
                        admin1.displayAllSongs();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        System.out.println("1- Piano");
                        System.out.println("2- Drums");
                        System.out.println("------------------------------------------");
                        System.out.println("Enter your choice: ");
                        inChoice = checkChoice(scanner);
                        scanner.nextLine();
                        System.out.println("------------------------------------------");
                        if(inChoice == 1)
                        {
                            admin1.displayAllPiano();
                        }
                        else if(inChoice == 2)
                        {
                            admin1.displayAllDrums();
                        }

                        System.out.println("------------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("1- track");
                    System.out.println("2- instruments");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = checkChoice(scanner);
                    scanner.nextLine();
                    System.out.println("------------------------------------------");
                    if(innerChoice == 1) {
                        addSong();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        System.out.println("1- Piano");
                        System.out.println("2- Drums");
                        System.out.println("------------------------------------------");
                        System.out.println("Enter your choice: ");
                        inChoice = checkChoice(scanner);
                        scanner.nextLine();
                        System.out.println("------------------------------------------");
                        if(inChoice == 1)
                        {
                            addPiano();
                        }
                        else if(inChoice == 2)
                        {
                            addDrums();
                        }

                        System.out.println("------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("1- track");
                    System.out.println("2- instruments");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = checkChoice(scanner);
                    scanner.nextLine();
                    System.out.println("------------------------------------------");
                    if(innerChoice == 1) {
                        modifySong();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        System.out.println("1- Piano");
                        System.out.println("2- Drums");
                        System.out.println("------------------------------------------");
                        System.out.println("Enter your choice: ");
                        inChoice = checkChoice(scanner);
                        scanner.nextLine();
                        System.out.println("------------------------------------------");
                        if(inChoice == 1)
                        {
                            modifyPiano();
                        }
                        else if(inChoice == 2)
                        {
                            modifyDrums();
                        }

                        System.out.println("------------------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("1- track");
                    System.out.println("2- instruments");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = checkChoice(scanner);
                    scanner.nextLine();
                    System.out.println("------------------------------------------");
                    if(innerChoice == 1) {
                        removeSong();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        System.out.println("1- Piano");
                        System.out.println("2- Drums");
                        System.out.println("------------------------------------------");
                        System.out.println("Enter your choice: ");
                        inChoice = checkChoice(scanner);
                        scanner.nextLine();
                        System.out.println("------------------------------------------");
                        if(inChoice == 1)
                        {
                            removePiano();
                        }
                        else if(inChoice == 2)
                        {
                            removeDrums();
                        }

                        System.out.println("------------------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("1- track");
                    System.out.println("2- instruments");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter your choice: ");
                    innerChoice = checkChoice(scanner);
                    scanner.nextLine();
                    System.out.println("------------------------------------------");
                    if(innerChoice == 1) {
                        searchForSong();
                        System.out.println("------------------------------------------");
                    }
                    else if (innerChoice == 2)
                    {
                        System.out.println("1- Piano");
                        System.out.println("2- Drums");
                        System.out.println("------------------------------------------");
                        System.out.println("Enter your choice: ");
                        inChoice = checkChoice(scanner);
                        scanner.nextLine();
                        System.out.println("------------------------------------------");
                        if(inChoice == 1)
                        {
                            searchForPiano();
                        }
                        else if(inChoice == 2)
                        {
                            searchForDrums();
                        }

                        System.out.println("------------------------------------------");
                    }
                    break;

                case 7:
                    System.out.println("------------------------------------------");
                    return -1;

                case 6:
                    l.register();
                    break;

                default:
                    System.out.println("Please choose an option/valid number from the above.");



            }
        }

    }

    // printInstruction function is used to print out the instructions.

    public static void printInstructionsV2()
    {
        System.out.println("------------------------------------------");
        System.out.println("Admin Panel");
        System.out.println("------------------------------------------");
        System.out.println("0 - to print choice options:");
        System.out.println("1 - to display all songs/instruments in stock:");
        System.out.println("2 - to add a song/instrument to the stock:");
        System.out.println("3 - to modify a song/instrument in the stock:");
        System.out.println("4 - to remove a song/instrument from the stock:");
        System.out.println("5 - to search for a song/instrument in the stock:");
        System.out.println("6 - add account to the system:");
        System.out.println("7 - to logout from the system:");
        System.out.println("------------------------------------------\n");

    }

    // addSong, addPiano, addDrums function(s) which will be used by the admin
    // to add the items to the system
    // by using taking the input and using them as parameters for the addSong, addPiano,
    // addDrums function(s)
    // from the stock list class to add them to the stock list object created above.

    public static void addSong()
    {
        System.out.println("Please, Enter the track's name:");
        String trackName = scanner.nextLine();
        System.out.println("Please, Enter the artist's name:");
        String artistName = scanner.nextLine();
        System.out.println("Please, Enter the album's name:");
        String albumName = scanner.nextLine();
        System.out.println("Please, Enter the track's length:");
        String length = scanner.nextLine();
        System.out.println("Please, Enter the track's type:");
        String type = scanner.nextLine();
        System.out.println("Please, Enter the number of sold tracks:");
        int soldTracks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of tracks available in the stock:");
        int tracksInStock = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the track's ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the track's prize:");
        int prize = scanner.nextInt();
        scanner.nextLine();
        admin1.addSong(id, trackName, artistName, albumName, length, type, soldTracks, tracksInStock, prize);
    }

    public static void addPiano()
    {
        System.out.println("Please, Enter the Piano Model Name:");
        String PianoName = scanner.nextLine();
        System.out.println("Please, Enter the Piano Type:");
        String PianoType = scanner.nextLine();
        System.out.println("Please, Enter the Piano ID:");
        int PianoID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the Piano Prize:");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of Sold pieces:");
        int soldPieces = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of available pieces:");
        int piecesInStock = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of piano keys:");
        int noKeys = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the piano keys material:");
        String material = scanner.nextLine();
        admin1.addPiano(PianoName,  PianoID, PianoType, soldPieces, piecesInStock,  price,  noKeys, material);

    }

    public static void addDrums()
    {
        System.out.println("Please, Enter the Drums Model Name:");
        String DrumsName = scanner.nextLine();
        System.out.println("Please, Enter the Drums Type:");
        String DrumsType = scanner.nextLine();
        System.out.println("Please, Enter the Drums ID:");
        int DrumsID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the Drums Prize:");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of Sold pieces (drums):");
        int soldPieces = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the number of available pieces (drums):");
        int piecesInStock = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the thickness of the drums:");
        int DrumsThickness = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter the drums material:");
        String DrumsMaterial = scanner.nextLine();
        admin1.addDrums(DrumsID, DrumsName, DrumsType, price, soldPieces, piecesInStock, DrumsMaterial, DrumsThickness);

    }

    // modifySong, modifyPiano, modifyDrums function(s) which will be used by the admin
    // to modify the items to the system
    // by using taking the input and using them as parameters for the modifySong,
    // modifyPiano and modifyDrums function(s)
    // from the stock list class to modify them then adding them to
    // the stock list object created above.

    public static void modifySong()
    {
        System.out.println("Please, Enter the Song's name you want to replace:");
        String existingTrack = scanner.nextLine();
        if(admin1.findSong(existingTrack) == -1)
        {
            System.out.println("Item not found");
        }
        else {
            System.out.println("Please, Enter the New track's name:");
            String trackName = scanner.nextLine();
            System.out.println("Please, Enter the New artist's name:");
            String artistName = scanner.nextLine();
            System.out.println("Please, Enter the New album's name:");
            String albumName = scanner.nextLine();
            System.out.println("Please, Enter the New track's length:");
            String length = scanner.nextLine();
            System.out.println("Please, Enter the New track's type:");
            String type = scanner.nextLine();
            System.out.println("Please, Enter the New number of sold tracks:");
            int soldTracks = scanner.nextInt();
            System.out.println("Please, Enter the New number of tracks available in the stock:");
            int tracksInStock = scanner.nextInt();
            System.out.println("Please, Enter the New number of track's ID:");
            int id = scanner.nextInt();
            System.out.println("Please, Enter the New track's prize:");
            int prize = scanner.nextInt();
            scanner.nextLine();
            admin1.modifySong(existingTrack, id,
                    trackName, artistName, albumName, length, type, soldTracks, tracksInStock, prize);
        }
    }

    public static void modifyPiano()
    {
        System.out.println("Please, Enter the piano's name you want to replace:");
        String existingPiano = scanner.nextLine();
        if(admin1.findPiano(existingPiano) == -1)
        {
            System.out.println("Item not found");
        }
        else {
            System.out.println("Please, Enter the new Piano Model Name:");
            String PianoName = scanner.nextLine();
            System.out.println("Please, Enter the new Piano Type:");
            String PianoType = scanner.nextLine();
            System.out.println("Please, Enter the new Piano ID:");
            int PianoID = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new Piano Prize:");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new number of Sold pieces:");
            int soldPieces = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new number of available pieces:");
            int piecesInStock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new number of piano keys:");
            int noKeys = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new piano keys material:");
            String material = scanner.nextLine();
            admin1.modifyPiano(existingPiano, PianoName, PianoID, PianoType,
                    soldPieces, piecesInStock, price, noKeys, material);
        }

    }

    public static void modifyDrums()
    {
        System.out.println("Please, Enter the Drums name you want to replace:");
        String existingDrums = scanner.nextLine();
        if(admin1.findDrums(existingDrums) == -1)
        {
            System.out.println("Item not found");
        }
        else {
            System.out.println("Please, Enter the new Drums Model Name:");
            String DrumsName = scanner.nextLine();
            System.out.println("Please, Enter the new Drums Type:");
            String DrumsType = scanner.nextLine();
            System.out.println("Please, Enter the new Drums ID:");
            int DrumsID = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new Drums Prize:");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new number of Sold pieces (drums):");
            int soldPieces = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new number of available pieces (drums):");
            int piecesInStock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new thickness of the drums:");
            int DrumsThickness = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please, Enter the new drums material:");
            String DrumsMaterial = scanner.nextLine();
            admin1.modifyDrums(existingDrums, DrumsID, DrumsName, DrumsType, price, soldPieces,
                    piecesInStock, DrumsMaterial, DrumsThickness);
        }

    }

    // removeSong, removePiano, removeDrums function(s) which will be used by the admin
    // to remove the items from the system
    // by using taking the input and using them as parameters for the removeSong,
    // removePiano and removeDrums function(s)
    // from the stock list class to remove them from the stock list object created above.

    public static void removeSong()
    {
        System.out.println("Please, Enter the name of the track you want to remove:");
        String existingName = scanner.nextLine();
        if(admin1.findSong(existingName) == -1)
        {
            System.out.println("Item not found");
        }
        else
            {
            admin1.removeSong(existingName);
        }
    }

    public static void removePiano()
    {
        System.out.println("Please, Enter the model of the piano you want to remove:");
        String existingName = scanner.nextLine();
        if(admin1.findPiano(existingName) == -1)
        {
            System.out.println("Item not found");
        }
        else
            {
            admin1.removePiano(existingName);
        }
    }

    public static void removeDrums()
    {
        System.out.println("Please, Enter the model of the Drums you want to remove:");
        String existingName = scanner.nextLine();
        if(admin1.findDrums(existingName) == -1)
        {
            System.out.println("Item not found");
        }
        else {
            admin1.removeDrums(existingName);
        }
    }

    // searchForSong, searchForPiano, searchForDrums function(s) which will be used by the admin
    // to search for the items in the system
    // by using taking the input and using them as parameters for the searchForSong,
    // searchForPiano and searchForDrums function(s)
    // from the stock list class to search for them in the stock list object created above.

    public static void searchForSong()
    {
        System.out.println("Please, Enter the name of the track you want to search for:");
        String searchItem = scanner.nextLine();
        if(admin1.onFileSong(searchItem))
        {
            System.out.println("Found " + searchItem + " in stock");
        }
        else
        {
            System.out.println(searchItem + "is not in stock");
        }
    }

    public static void searchForPiano()
    {
        System.out.println("Please, Enter the Model of the Piano you want to search for:");
        String searchItem = scanner.nextLine();
        if(admin1.onFilePiano(searchItem))
        {
            System.out.println("Found " + searchItem + " in stock");
        }
        else
        {
            System.out.println(searchItem + "is not in stock");
        }
    }

    public static void searchForDrums()
    {
        System.out.println("Please, Enter the Model of the Drums you want to search for:");
        String searchItem = scanner.nextLine();
        if(admin1.onFileDrums(searchItem))
        {
            System.out.println("Found " + searchItem + " in stock");
        }
        else
        {
            System.out.println(searchItem + "is not in stock");
        }
    }

    // returnStock is a function created to return the stock
    // created above to be used in another function in another class.

    public stockList returnStock()
    {
        return admin1;
    }

    // returnLoginData is a function created to return the Login data
    // created above to be used in another function in another class.

    public LogAndReg returnLoginData()
    {
        return l;
    }

    // checkChoice is a function created to check if the choice in the admin panel is number or not

    public static int checkChoice(Scanner scanner)
    {

            if(scanner.hasNextInt())
            {

                return scanner.nextInt();
            }
            else
                {
                    System.out.println("Please enter a valid number.");
                    return -1;
                }

    }
}
