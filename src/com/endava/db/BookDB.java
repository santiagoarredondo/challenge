package com.endava.db;


import com.endava.model.Book;
import com.endava.utils.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDB {
    public static ArrayList<Book> findBook(int id, String name, long ISBN, int authorId, int publisherId, int libraryId){
        ArrayList<Book> result = new ArrayList<Book>();
        try {
            Connection conn = DataBase.getConnection();
            Statement statement = null;
            ResultSet reg;
            String sentence = "select * from book where ";

            if (id>=0){
                sentence+=" id ="+id+" AND ";
            }

            if (authorId>=0){
                sentence+=" authorid ="+id+" AND ";
            }

            if (ISBN>=0){
                sentence+=" ISBN ="+id+" AND ";
            }

            if (publisherId>=0){
                sentence+=" publisherid ="+id+" AND ";
            }

            if (libraryId>=0){
                sentence+=" libraryid ="+id+" AND ";
            }

            if (!(name.equals(null)||name.equals(""))){
                sentence+=" name = '"+name+"' AND";
            }

            sentence+=" 1=1";

            statement = conn.createStatement();
            System.out.println(sentence);
            reg = statement.executeQuery(sentence);

            while (reg.next()){
                Book b = new Book(reg.findColumn("id"));
                b.setName(reg.getString(reg.findColumn("name")));
                b.setISBN(reg.findColumn("isbn"));
                b.setAuthorId(reg.findColumn("authorid"));
                b.setLibarayId(reg.findColumn("libraryid"));
                b.setPublisherId(reg.findColumn("publisherid"));
                result.add(b);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
