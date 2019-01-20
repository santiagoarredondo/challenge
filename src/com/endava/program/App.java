package com.endava.program;

import com.endava.db.AuthorDB;
import com.endava.model.Author;

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
        ArrayList<Author> a = AuthorDB.findAuthor(1, "","");
        for (Author author: a) {
            System.out.println(author.toString());
        }
    }
}
