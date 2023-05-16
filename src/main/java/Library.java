import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (!isFull()) {
            this.books.add(book);
        }
    }

    public boolean isFull() {
        return getBookCount() >= this.capacity;
    }


}
