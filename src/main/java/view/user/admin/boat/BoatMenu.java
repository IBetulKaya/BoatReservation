package view.user.admin.boat;

public class BoatMenu {

    public static void boatMenu(){
do {

    printMessage("User Management");
    printMessage("Choose an action from the following menu:");
    printMessage("1 - Add new reservation");
    printMessage("2 - Update a reservation");
    printMessage("3 - Delete a reservation");
    printMessage("4 - View all reservation");
    printMessage("9 - Go Back");


} while(true);




    }


    public static void printMessage(String message){
        System.out.println(message);
    }
}
