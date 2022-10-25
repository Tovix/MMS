import java.util.ArrayList;
import java.util.Scanner;

// description: order panel with all the functionalities needed by the user to
// add, buy and remove items from his cart.

// OOP principals applied: encapsulation appears in the objects
// created as private objects.

public class Order
{
    // creating an arraylist from songs, piano and drums in order
    // to store the order items in it.
    // also creating stock list as a parameter for the constructor.

    private final ArrayList<Songs> songsOrder = new ArrayList<>();
    private final ArrayList<piano> PianoOrder = new ArrayList<>();
    private final ArrayList<drums> DrumsOrder = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private final stockList stock;
    private int option;

    public Order(stockList stock)
    {
        this.stock = stock;
    }

    // order panel with switch cases to use all the functions.

    public void createOrder()
    {
        System.out.println("Create Order for :");
        System.out.println("1- Tracks");
        System.out.println("2- Instruments");
        System.out.println("------------------------------------------");
        System.out.println("Enter your choice: ");
        int choice;
        int subChoice;

        choice = admin.checkChoice(scanner);
        scanner.nextLine();
        System.out.println("------------------------------------------");
        if(choice == 1)
        {
            option = 0;
        }
        else if(choice == 2)
        {
            System.out.println("Create Order for :");
            System.out.println("1- Pianos");
            System.out.println("2- Drums");
            System.out.println("------------------------------------------");
            System.out.println("Enter your choice: ");
            subChoice = admin.checkChoice(scanner);
            scanner.nextLine();
            if(subChoice == 1)
            {
                option = 1;
            }
            else if(subChoice == 2)
            {
                option = 2;
            }
            else
                {
                    System.out.println("Wrong Choice.");
                }
        }
        else
            {
                System.out.println("Wrong choice");
            }

        boolean quit = false;


        while (!quit)
        {
            printInstructions(option);
            System.out.println("Enter your choice: ");
            choice = admin.checkChoice(scanner);
            scanner.nextLine();
            System.out.println("------------------------------------------\n");

            switch (choice)
            {
                case 0:
                    printInstructions(option);
                    System.out.println("------------------------------------------\n");
                    break;
                case 1:
                    addToOrder(option);
                    System.out.println("------------------------------------------\n");
                    break;
                case 2:
                    removeFromOrder(option);
                    System.out.println("------------------------------------------\n");
                    break;
                case 3:
                    displayOrder(option);
                    break;
                case 4:
                    confirmOrder(option);
                    quit = true;
                    System.out.println("------------------------------------------\n");
                    break;
                default:
                    System.out.println("Please choose an option/valid number from the above.");
            }
        }
    }

    // displayOrder is working with three options(0 (songs), 1 (piano), 2(drums))
    // as a general rule it does a for-loop on the order list created above and
    // display every single item's data.

    private void displayOrder(int option)
    {
        if(option == 0)
        {
            for (int i = 0; i < songsOrder.size(); i++)
            {
                System.out.println("Song # " + (i + 1) + "\n" + songsOrder.get(i).getId() +
                        "   " + songsOrder.get(i).getTrackName() + "\n" + songsOrder.get(i).getPrize() + " EGP");
            }
        }

        else if(option == 1)
        {
            for (int i = 0; i < PianoOrder.size(); i++)
            {
                System.out.println("Instrument #" + (i + 1) + "\n" + PianoOrder.get(i).getInstrument_id() +
                        "   " + PianoOrder.get(i).getInstrument_model() + "\n" +
                        PianoOrder.get(i).getInstrument_price() + " EGP");
            }
        }

        else if(option == 2)
        {
            for (int i = 0; i < DrumsOrder.size(); i++)
            {
                System.out.println("Instrument #" + (i + 1) + "\n" + DrumsOrder.get(i).getInstrument_id() +
                        "   " + DrumsOrder.get(i).getInstrument_model() + "\n" +
                        DrumsOrder.get(i).getInstrument_price() + " EGP");
            }
        }
    }

    private void printInstructions(int option)
    {
        if(option == 0) {
            System.out.println("Music buying panel");
            System.out.println("------------------------------------------");
            System.out.println("0 - Print Instructions:");
            System.out.println("1 - Add track to cart:");
            System.out.println("2 - To remove track from the cart:");
            System.out.println("3 - To review songs order:");
            System.out.println("4 - To proceed to checkout:");
            System.out.println("------------------------------------------");
        }
        else if(option == 1 || option == 2) {
            System.out.println("instruments buying panel");
            System.out.println("------------------------------------------");
            System.out.println("0 - Print Instructions:");
            System.out.println("1 - Add instrument to cart:");
            System.out.println("2 - To remove instrument from the cart:");
            System.out.println("3 - To review instrument order:");
            System.out.println("4 - To proceed to checkout:");
            System.out.println("------------------------------------------");
        }
    }

    // addToOrder is working with three options(0 (songs), 1 (piano), 2(drums))
    // as a general rule it add an item to the order if the item's stock is
    // not equal to zero and it exist (it's position is greater than 1 means it is
    // in the stock).

    private void addToOrder(int option)
    {
        if(option == 0)
        {
            stock.displayAllSongs();
            System.out.println("Please enter the the Track's Name:");
            String addedTrackName = scanner.nextLine();
            if(stock.returnSong(addedTrackName).getTracksInStock() != 0 && stock.findSong(addedTrackName) != -1)
            {

                songsOrder.add(stock.returnSong(addedTrackName));
            }
            else
                {
                    System.out.println(addedTrackName + " is sold out/not available right now in our stock");
                }
        }

        else if(option == 1)
        {
            stock.displayAllPiano();
            System.out.println("Please enter the the Piano Model's Name:");
            String addedPianoName = scanner.nextLine();
            if(stock.returnPiano(addedPianoName).getInstrumentsInStock() != 0 && stock.findPiano(addedPianoName) != -1)
            {
                PianoOrder.add(stock.returnPiano(addedPianoName));
            }
            else
            {
                System.out.println(addedPianoName + " is sold out/not available right now in our stock");
            }
        }

        else if(option == 2)
        {
            stock.displayAllDrums();
            System.out.println("Please enter the the Drums Model's Name:");
            String addedDrumsName = scanner.nextLine();
            if(stock.returnDrums(addedDrumsName).getInstrumentsInStock() != 0 && stock.findDrums(addedDrumsName) != -1)
            {
                DrumsOrder.add(stock.returnDrums(addedDrumsName));
            }
            else
            {
                System.out.println(addedDrumsName + " is sold out/not available right now in our stock");
            }
        }
    }

    // removeFromOrder is working with three options(0 (songs), 1 (piano), 2(drums))
    // as a general rule it remove an item to the order as it asks for the item name
    // and remove it from the order.

    private void removeFromOrder(int option)
    {
        if(option == 0)
        {
            displayOrder(0);
            System.out.println("Please enter the the Track's Name:");
            String removedTrackName = scanner.nextLine();
            if(findSongInOrder(removedTrackName) == -1)
            {
                System.out.println("Item not found");
            }
            else {
                songsOrder.remove(stock.returnSong(removedTrackName));
                System.out.println("Item removed successfully");
            }
        }

        else if(option == 1)
        {
            displayOrder(1);
            System.out.println("Please enter the the Piano's Name:");
            String removedPianoName = scanner.nextLine();
            if(findPianoInOrder(removedPianoName) == -1)
            {
                System.out.println("Item not found");
            }
            else {
                PianoOrder.remove(stock.returnPiano(removedPianoName));
                System.out.println("Item removed successfully");
            }
        }

        else if(option == 2)
        {
            displayOrder(2);
            System.out.println("Please enter the the Drums Name:");
            String removedDrumsName = scanner.nextLine();
            if(findDrumsInOrder(removedDrumsName) == -1)
            {
                System.out.println("Item not found");
            }
            else {
                DrumsOrder.remove(stock.returnDrums(removedDrumsName));
                System.out.println("Item removed successfully");
            }
        }
    }

    // confirmOrder is working with three options(0 (songs), 1 (piano), 2(drums))
    // it displays the order and asks the user to confirm it then it calculates it's
    // price and then it clears the order from the memory.

    private void confirmOrder(int option)
    {
        if(option == 0)
        {
            displayOrder(0);
            calculateOrderPrize(0);
            System.out.println("Purchase successful");
            reloadStock(0);
            songsOrder.clear();
        }

        else if(option == 1)
        {
            displayOrder(1);
            calculateOrderPrize(1);
            System.out.println("Purchase successful");
            reloadStock(1);
            PianoOrder.clear();
        }

        else if(option == 2)
        {
            displayOrder(2);
            calculateOrderPrize(2);
            System.out.println("Purchase successful");
            reloadStock(2);
            DrumsOrder.clear();
        }
    }

    // calculateOrderPrize is working with three options(0 (songs), 1 (piano), 2(drums))
    // as a general rule it does for-loop on the order list and retrieve it's price
    // then sums it up and displaying the total in the end.

    private void calculateOrderPrize(int option)
    {
        if(option == 0)
        {
            int sum1 = 0;
            for (int i = 0; i < songsOrder.size(); i++)
            {
                System.out.println("prize of song #" + (i + 1) + "  " + songsOrder.get(i).getPrize() + " EGP");
                sum1 += songsOrder.get(i).getPrize();
            }
            System.out.println("------------------------------------------");
            System.out.println("The total prize of the track(s) is :" + sum1 + " EGP");
        }

        else if(option == 1)
        {
        int sum2 = 0;
        for (int i = 0; i < PianoOrder.size(); i++) {
            System.out.println("prize of instrument# " + (i + 1) + "  " + PianoOrder.
                    get(i).getInstrument_price() + " EGP");
            sum2 += PianoOrder.get(i).getInstrument_price();
        }
            System.out.println("------------------------------------------");
        System.out.println("The total prize of the Piano(s) is :" + sum2 + " EGP");
        }

        else if(option == 2)
        {
            int sum3 = 0;
            for (int i = 0; i < DrumsOrder.size(); i++) {
                System.out.println("prize of instrument# " + (i + 1) + "  " + DrumsOrder.
                        get(i).getInstrument_price() + " EGP");
                sum3 += DrumsOrder.get(i).getInstrument_price();
            }
            System.out.println("------------------------------------------");
            System.out.println("The total prize of the Drum(s) is :" + sum3 + " EGP");
        }
    }

    // reloadStock is working with three options(0 (songs), 1 (piano), 2(drums))
    // as a general rule it does for-loop on the order list and reload the stock
    // ( apply the changes to the stock number and the number of the sold item after purchase).
    // for example if I bought 1 drum therefore, it's sold item number will go up by one and
    // it's stock will decrease by one.

    private void reloadStock(int option)
    {
        if(option == 0)
        {
            for (Songs songs : songsOrder)
            {
                stock.trackSold(songs.getTrackName());
            }
        }
        else if(option == 1)
        {
            for (piano pianos : PianoOrder)
            {
                stock.pianoSold(pianos.getInstrument_model());
            }
        }
        else if(option == 2)
        {
            for (drums drums : DrumsOrder)
            {
                stock.DrumsSold(drums.getInstrument_model());
            }
        }

    }
    // the following three functions (findSongInOrder, findPianoInOrder, findDrumsInOrder) are created to search
    // for an item by entering the track name, piano model or the drums model and if it is found it is name is printed.
    // notice that: this functions will return position (number) that will be used in other functions,
    // to retrieve the position of the object and apply the function on it.

    public int findSongInOrder(String trackName)
    {
        for(int i = 0; i < songsOrder.size(); i++)
        {
            if(songsOrder.get(i).getTrackName().equals(trackName))

            {
                return i;
            }
        }
        return -1;
    }

    public int findPianoInOrder(String pianoName)
    {
        for(int i = 0; i < PianoOrder.size(); i++)
        {
            if(PianoOrder.get(i).getInstrument_model().equals(pianoName))
            {
                return i;
            }
        }
        return -1;
    }

    public int findDrumsInOrder(String DrumsName)
    {
        for(int i = 0; i < DrumsOrder.size(); i++)
        {
            if(DrumsOrder.get(i).getInstrument_model().equals(DrumsName))
            {
                return i;
            }
        }
        return -1;
    }
}
