package com.endava.app;

import java.util.Scanner;

public class App {

    private final static int SALIR=5;

    private static void showOptions(){
        System.out.println("WELLCOME TO THE ENDAVA LIBRARY\n\n" +
                "choose an option:\n" +
                "1." +
                "2." +
                "3." +
                "4." +
                "5. exit");
    }

    private static void menu(){
        Scanner input = new Scanner(System.in);
        try {
            showOptions();
            while (input.nextInt()!=SALIR) {
                showOptions();
            }
            System.exit(0);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        menu();
    }
}
