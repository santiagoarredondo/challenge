package com.endava.program;

import com.endava.db.BookDB;
import com.endava.model.Book2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static void menu(){
        Scanner input = new Scanner(System.in);
        try {

        }catch (Exception e){
            
        }
    }

    public static void main(String[] args){
        ArrayList<Book2> a = BookDB.findBook(0,"","",0,"","");
        for (Book2 book: a) {
            System.out.println(book.toString());
        }
    }
}
