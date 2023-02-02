import java.util.Objects;

public class Book {
    private String bookName;
    private int bookAge;

    public Book ( String bookName, int bookAge ) {
        this.bookName = bookName;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return this.bookName;
    }
    public int getBookAge() {
        return this.bookAge;
    }

    public void setBookAge (int bookAge) {
        this.bookAge = bookAge;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return bookAge == book.bookAge && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAge);
    }

    @Override
    public String toString() {
        return "Название книги " + bookName + " " +
                " издана " + bookAge ;
    }
}

