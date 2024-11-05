package view.user.admin.reservation;

import model.ProcessUtils;

public class ReservationMenu {
    public static void reservationMenu(){
        RESERVATION_MENU_LABEL:
        do{


        printMessage("User Management");
        printMessage("Choose an action from the following menu:");
        printMessage("1 - Add new reservation");
        printMessage("2 - Update a reservation");
        printMessage("3 - Delete a reservation");
        printMessage("4 - View all reservation");
        printMessage("9 - Go Back");
        String input = ProcessUtils.getInputString("Enter choice");

        switch(input){
            case "1" :
                //TODO call the new reservation method.
            case "2":
                //TODO call the update reservation.
            case "3":
                //TODO call the delete a reservation.
            case "4" :
                //TODO to call view reservation.
            case "9":
                break RESERVATION_MENU_LABEL;
            default :
                printMessage("Invalid choice..");
        }







        }while(true);

    }public static void printMessage(String message){
        System.out.println(message);
    }
}
