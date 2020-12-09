package com.company;

public class BookTest {
    public static void main(String[] args){
        Book a= new Book();
        a.setPages(1225);
        a.setYear(1869);
        a.setTitle("War and Peace");
        a.setAuthor("Leo Tolstoy");
        System.out.print("Название и автор книги: "+a.getTitle()+", "+a.getAuthor()+ " Год написания: "+ a.getYear()+" Число страниц: "+a.getPages());
    }
}
