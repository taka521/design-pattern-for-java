package book;

import iterator.Aggregate;
import iterator.BookShelfIterator;
import iterator.Iterator;

/**
 * 本棚クラス
 */
public class BookShelf implements Aggregate {

    /** 本棚の本 */
    private Book[] books;

    /** 最後の本の位置 */
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return this.books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
