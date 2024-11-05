package view.user.admin.users;

import model.ProcessUtils;
import model.User;

public class UsersMenu {
    public static void adminMenu(User user){
        ADMIN_MENU:
        do {

            printMessage("User Management");
            printMessage("Choose an action from the following menu:");
            printMessage("1 - Add new user");
            printMessage("2 - Update a user");
            printMessage("3 - Delete a user");
            printMessage("4 - View all users");
            printMessage("9 - Logout");
            String input = ProcessUtils.getInputString("Enter your choice here : ");
            switch (input){
                case "1":
                    //TODO create a users menu
                case "2":
                    //TODO create a boats menu
                case "3":
                    //TODO create a reservations menu
                case "9":
                    break ADMIN_MENU;
                default:
                    System.out.println("Invalid choice !");



            }


        }while (true);

    }
    public static void printMessage(String message){
        System.out.println(message);
    }
}
