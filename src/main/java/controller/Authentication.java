package controller;

import model.Model;
import model.User;
import model.Users;
import view.user.admin.AdminMainMenu;

import java.util.ArrayList;

public class Authentication {


    public static void login(String userName, String password) {
        ArrayList<User> users = Model.getInstance().getUsers().getUsers();
        for (User user : users){
            if (user.getUserName().equals(userName)){
                if(user.getPassword().equals(password)){
                    if (user.getRole().equals("Admin")){
                        //TODO we have to call admin page
                        AdminMainMenu.adminMenu(user);
                    } else if (user.getRole().equals("Employee")) {
                        //TODO  we have to call employee page
                    }

                }else {
                    System.out.println("incorrect password !");
                }


            }else {
                System.out.println("Username not found !");
            }
        }
    }
}
