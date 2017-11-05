package book;

/**
 * 本クラス
 */
public class Book {

    private final String name;

    public Book(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "book.Book{" + "name='" + name + '\'' + '}';
    }
}
