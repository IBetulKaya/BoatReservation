package view.user.admin;

import model.ProcessUtils;
import model.User;
import model.Users;

public class AdminMainMenu {

    public static void adminMenu(User user){
        ADMIN_MENU:
        do {

            printMessage("Welcome" + user.getUserName() + "!");
            printMessage("Choose an action from the following menu:");
            printMessage("1 - Manage Users");
            printMessage("2 - Manage Boats");
            printMessage("3 - Manage Reservation");
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
