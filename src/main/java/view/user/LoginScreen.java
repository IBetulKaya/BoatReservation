package view.user;

import controller.Authentication;
import model.ProcessUtils;

public class LoginScreen {
    public static void view(){
        LOGIN_LABEL:
        do {
            String name = ProcessUtils.getScanner().nextLine();
            printMessage("Welcome to Molveno Hotel Boat Reservation");
            printMessage("==========================================");
            String userName = ProcessUtils.getInputString("Enter username : ");
            String password = ProcessUtils.getInputString("Enter password : ");

            Authentication.login(userName,password);

            //TODO we have to valid user input
        }while (true);

    }
    public static void printMessage(String message){
        System.out.println(message);
    }

}
