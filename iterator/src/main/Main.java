package main;

import book.Book;
import book.BookShelf;
import iterator.Iterator;

public class Main {

    public static void main(String[] args) {

        // 本棚の生成
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java入門"));
        bookShelf.appendBook(new Book("Ruby入門"));
        bookShelf.appendBook(new Book("Scala入門"));
        bookShelf.appendBook(new Book("HTML入門"));

        // イテレータで順に参照
        Iterator iterator = bookShelf.iterator();
        Book book;
        while (iterator.hasNext()) {
            book = (Book) iterator.next();
            System.out.println(book);
        }

    }
}
