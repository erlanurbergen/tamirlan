package tamirlan.Books_and_dictionaries;

import tamirlan.Understanding_references.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bookshelf {
    List<Books> booksList = new ArrayList<>();

    // empty ()

    // Returns the number of books on the bookshelf
    public int size() {
       return booksList.size();
    }

    // Adds a book on the left side of the shelf.
// Shifts all other books one position to the right
    public void addBookOnLeftSide(Books b) {
        this.addBook(0, b);
    }

    // Adds a book on the right side of the shelf.
    public void addBookOnRightSide(Books b){
        booksList.add(b);
    }

    // Adds book in position i counting from the left, starting
    // from zero, and shifts all other books one position to the right.
    // Hence addBook(0, b) is equivalent to addBookOnLeftSide(b), and
    // addBook(size(), b) is equivalent to addBookOnRightSide(b)
    public void addBook(int i, Books b) {
        if (i > booksList.size()) {
            System.out.println("Данного индекса нету");
        }
        booksList.add(i, b);
    }

    // Removes book from position i, shifting all books with position
// greater than i to the left
    public Books remove(int i){
        Books b = booksList.get(i); // [i] - возвращает книгу по индексу
        booksList.remove(i);
        return b;
    }

    // Prints all details of books from left to right
    public void printLeftToRight(){
        booksList.forEach(System.out::println);
    }

    // Prints all details of books from right to left
    public void printRightToLeft(){
        Collections.reverse(booksList);
        booksList.forEach(System.out::println);
        Collections.reverse(booksList);
    }



    @Override
    public String toString() {
        return "Bookshelf{" +
                "booksList=" + booksList +
                '}';
    }
}
