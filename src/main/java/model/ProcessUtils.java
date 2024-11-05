package model;

import java.util.Scanner;

public class ProcessUtils {
    private static Scanner scanner;

    private ProcessUtils() {
    }

    public static Scanner getScanner(){
        if (scanner==null){
            scanner= new Scanner(System.in);
        }
        return scanner;
    }

    public static String getInputString(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input;
    }
    public static void closeScanner(){
        scanner.close();
    }
//    public static int getInputInt(String prompt){
//        System.out.println(prompt);
//        int input = Integer.parseInt(scanner.nextLine());
//        return input;
//    }


}
