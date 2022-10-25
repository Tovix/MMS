import java.util.ArrayList;
import java.util.Scanner;

// description: login and register class in order to add or
// retrieve admin/user accounts data.

// OOP principals applied: encapsulation appears in the objects
// created as private objects.


public class LogAndReg
{
    // arraylist created for username, password, type of the account,
    // e-mail and address to store their data.

    private final ArrayList<String> username = new ArrayList<>();
    private final ArrayList<String> password = new ArrayList<>();
    private final  ArrayList<String> type = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // register function takes all info and add them to their
    // corresponding array list.

    public void register()
    {
        System.out.println("Enter your username: ");
        String s = input.nextLine();
        username.add(s);

        System.out.println("Enter your password: ");
        String ps = input.nextLine();
        password.add(ps);

        System.out.println("Enter the account type: ");
        String ty = input.nextLine();
        type.add(ty);


        System.out.println("Registration Completed.");
    }

    // login_in function used to check if the entered username and password matches any data in the array list
    // then it will allow the user to access his account.

    public int log_in()
    {

        System.out.println("Enter your username: ");
        String name = input.nextLine();
        System.out.println("------------------------------------------");
        System.out.println("Enter your Password: ");
        String pass = input.nextLine();
        System.out.println("------------------------------------------");
        if(name.equals("admin") && pass.equals("admin"))
        {
            System.out.println("This is a default account\nif you are using this system for the first time\n" +
                    "please add an account through this menu.");
            return 2;
        }
        else
            {

            for (int i = 0; i < username.size(); i++) {
                if (username.get(i).equals(name) && password.get(i).equals(pass)
                        && type.get(i).toLowerCase().equals("user"))
                {
                    System.out.println("Welcome " + username.get(i));
                    System.out.println("You have user privileges.");
                    return 0;
                } else if (username.get(i).equals(name) && password.get(i).equals(pass)
                        && type.get(i).toLowerCase().equals("admin"))
                {
                    System.out.println("Welcome " + username.get(i));
                    System.out.println("You have admin privileges.");
                    return 1;
                }


            }
        }

        return -1;

    }
}
