import java.util.Scanner;

// description: the main interface of the system includes the login screen
// and all the functionalities end up being used here.

// OOP principals applied: encapsulation appears in the objects
// created as private objects.

public class MMS_Sys
{
    // creating admin, order, user objects where order takes the admin stock as a parameter
    // and the user takes the admin stock and the order as parameters.

    private final admin admin1 = new admin();
    private final Order order = new Order(admin1.returnStock());
    private final User user = new User(admin1.returnStock(), order);
    private final Scanner scanner = new Scanner(System.in);

    public void run()
    {
        boolean quit = false;
        while (!quit){
            System.out.println("Music Store (MMS)");
            System.out.println("------------------------------------------");
            System.out.println("1-login");
            System.out.println("2-quit");
            System.out.println("------------------------------------------");
            System.out.println("Please enter your choice:");
            System.out.println("------------------------------------------");
            int choice = scanner.nextInt();
            System.out.println("------------------------------------------");
            boolean quitV2 = false;
            if(choice == 1)
            {
                while(!quitV2)
                {
                    int identifier = admin1.returnLoginData().log_in();
                    if (identifier == 0)
                    {

                        if (user.userPanel() == -1)
                        {
                            quitV2 = true;
                        }
                    }
                    else if (identifier == 1)
                    {

                        if (admin1.adminPanel() == -1)
                        {
                            quitV2 = true;
                        }
                    }
                    else if (identifier == 2)
                    {

                        if (admin1.adminPanel() == -1)
                        {
                            quitV2 = true;
                        }
                    }
                    else
                    {
                        System.out.println("Wrong user name");
                        quitV2 = true;
                    }
                }
            }
            else if(choice == 2)
            {
                quit = true;
            }
        }
    }
}
