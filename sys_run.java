//import java.util.Scanner;
//
//// description: the main interface of the system includes the login screen
//// and all the functionalities end up being used here.
//
//public class sys_run
//{
//    public static void main(String[] args)
//    {
//        // creating admin, order, user objects where order takes the admin stock as a parameter
//        // and the user takes the admin stock and the order as parameters.
//
//        admin admin1 = new admin();
//        Order order = new Order(admin1.returnStock());
//        User user = new User(admin1.returnStock(), order);
//
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        while (!quit)
//
//        // Login screen with switch cases to use all the functions.
//
//        {
//            System.out.println("Music Store (MMS)");
//            System.out.println("------------------------------------------");
//            System.out.println("1-login");
//            System.out.println("2-quit");
//            System.out.println("------------------------------------------");
//            System.out.println("Please enter your choice:");
//            System.out.println("------------------------------------------");
//            int choice = scanner.nextInt();
//            System.out.println("------------------------------------------");
//            boolean quitV2 = false;
//            if(choice == 1)
//            {
//                while(!quitV2)
//                {
//                    int identifier = admin1.returnLoginData().log_in();
//                    if (identifier == 0)
//                    {
//
//                        if (user.userPanel() == -1)
//                        {
//                            quitV2 = true;
//                        }
//                    }
//                    else if (identifier == 1)
//                    {
//
//                        if (admin1.adminPanel() == -1)
//                        {
//                            quitV2 = true;
//                        }
//                    }
//                    else if (identifier == 2)
//                    {
//
//                        if (admin1.adminPanel() == -1)
//                        {
//                            quitV2 = true;
//                        }
//                    }
//                    else
//                        {
//                        System.out.println("Wrong user name");
//                        quitV2 = true;
//                    }
//                }
//            }
//            else if(choice == 2)
//            {
//                quit = true;
//            }
//        }
//    }
//}
