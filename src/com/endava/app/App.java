package com.endava.app;

import com.endava.db.BookDB;
import com.endava.model.Book;
import com.endava.model.Book2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private final static int SALIR=5;

    private static void search(){
        ArrayList<Book2> a = BookDB.findBook(0,"","",0,"","");
        for (Book2 book: a) {
            System.out.println(book.toString());
        }
    }

    private static void insert(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please insert the book name: ");
            String name = input.nextLine();
            System.out.println("Please insert the book author: ");
            String author = input.nextLine();
            System.out.println("Please insert the book ISBN: ");
            int ISBN = Integer.parseInt(input.nextLine());
            System.out.println("Please insert the book language: ");
            String language = input.nextLine();
            System.out.println("Please insert the book publisher: ");
            String publisher = input.nextLine();
            BookDB.insertBook(name, author, ISBN, language, publisher);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void update(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please insert the book id: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Please insert the new book name: ");
            String name = input.nextLine();
            System.out.println("Please insert the new book author: ");
            String author = input.nextLine();
            System.out.println("Please insert the new book ISBN: ");
            int ISBN = Integer.parseInt(input.nextLine());
            System.out.println("Please insert the new book language: ");
            String language = input.nextLine();
            System.out.println("Please insert the new book publisher: ");
            String publisher = input.nextLine();
            BookDB.updateBook(id,name,author,ISBN,language,publisher);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void delete(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please insert the book id you want to delete: ");
            int id = Integer.parseInt(input.nextLine());
            BookDB.deleteBook(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void showOptions(){
        System.out.println("WELLCOME TO THE ENDAVA LIBRARY\n\n" +
                "choose an option:\n" +
                "1. Search books" +
                "2. Add book" +
                "3. Delete Book" +
                "4. Update book" +
                "5. exit");
    }

    private static void menu(){
        Scanner input = new Scanner(System.in);
        try {
            showOptions();
            while (input.nextInt()!=SALIR) {
                showOptions();
                System.out.println("Please choose an option: ");
                int option = Integer.parseInt(input.nextLine());
                switch (option){
                    case 1:
                       search();
                       break;
                    case 2:
                        insert();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        update();
                        break;
                    default:
                        System.out.println("invalid option");
                        break;
                }
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
