package com.endava.db;


import com.endava.model.Book2;
import com.endava.utils.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDB {
    public static ArrayList<Book2> findBook(int id, String name, String author, int ISBN, String language, String publisher){
        ArrayList<Book2> result = new ArrayList<Book2>();
        try {
            Connection conn = DataBase.getConnection();
            Statement statement = null;
            ResultSet reg;
            String sentence = "select * from book where ";

            if (id>=0){
                sentence+=" id ="+id+" AND ";
            }

            if (ISBN>=0){
                sentence+=" ISBN ="+id+" AND ";
            }


            if (!(author.equals(null)||author.equals(""))){
                sentence+=" author = '"+author+"' AND";
            }

            if (!(language.equals(null)||language.equals(""))){
                sentence+=" lan = '"+language+"' AND";
            }

            if (!(publisher.equals(null)||publisher.equals(""))){
                sentence+=" publisher = '"+publisher+"' AND";
            }

            sentence+=" 1=1";

            statement = conn.createStatement();
            System.out.println(sentence);
            reg = statement.executeQuery(sentence);

            while (reg.next()){
                Book2 b = new Book2(reg.findColumn("id"));
                b.setName(reg.getString(reg.findColumn("name")));
                b.setISBN(reg.findColumn("isbn"));
                b.setAuthor(reg.getString(reg.findColumn("author")));
                b.setLanguage(reg.getString(reg.findColumn("lan")));
                b.setPublisher(reg.getString(reg.findColumn("publisher")));
                result.add(b);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
