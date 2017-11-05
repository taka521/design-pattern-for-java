package iterator;

import book.Book;
import book.BookShelf;

/**
 * 本棚イテレータ
 */
public class BookShelfIterator implements Iterator {

    /** 本棚 */
    private BookShelf bookShelf;

    /** 本の位置 */
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
