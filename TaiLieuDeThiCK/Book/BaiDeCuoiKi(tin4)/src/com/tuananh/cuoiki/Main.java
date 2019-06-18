package com.tuananh.cuoiki;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager();
      //  bookManager.ReadBook();
        bookManager.addNguoiMua();
        bookManager.SortName(bookManager.addNguoiMua());
    }
}
