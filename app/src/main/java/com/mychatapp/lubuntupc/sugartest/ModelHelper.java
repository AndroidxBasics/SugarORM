package com.mychatapp.lubuntupc.sugartest;

import java.util.List;

/**
 * Created by lubuntupc on 18.12.17.
 */

public class ModelHelper {
    public static List<Book> getAllContacts() {
        return Book.listAll(Book.class);
    }
}