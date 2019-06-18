package com.tuananh.cuoiki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BookManager {
    public ArrayList<Book> addNguoiMua(){
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập  ng mua!");
            int n = sc.nextInt();
        for (int i = 0; i <n ; i++ ){
            System.out.println("Tên tác giả:");
            String tacgia= sc.nextLine();
            System.out.println("mã số:");
            String maso= sc.nextLine();
            System.out.println("tên sách:");
            String tesach = sc.nextLine();
            System.out.println("Giá:");
            int gia = Integer.parseInt(sc.nextLine());
            System.out.println("Phần tram giảm giá:");
            double giamgia= Double.parseDouble(sc.nextLine());
            books.add(new Book(tacgia, maso, tesach, gia, giamgia));

        }
        return books;
    }
     public void SortName(ArrayList<Book> books){
         Collections.sort(books, (b1, b2) -> (b1.getTacgia().compareTo(b2.getTacgia())));
     }


    public void ReadBook() throws IOException {
        File file = new File("F:\\books.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c != -1){
            System.out.print((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.read();
    }
}
