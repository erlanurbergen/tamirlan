package tamirlan.Books_and_dictionaries;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books b = new Books("123", "War", 1020);
        Books b2 = new Books("444", "Warrior", 500);
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBookOnRightSide(b); // она сейчас в конце
        bookshelf.addBookOnRightSide(b2);
        // String isbn, String title, int pages, String sourceLanguage,
        // String targetLanguage, int numDefinitions
        Dictionary dictionary = new Dictionary("111", "rrr",
                450, "eng", "rus", 70);

        Dictionary dictionary2 = new Dictionary("111", "ttt",
                450, "eng", "rus", 70);

        bookshelf.addBookOnRightSide(dictionary);
        bookshelf.addBookOnRightSide(dictionary2);

        rearange(bookshelf);

        getData(1, 2, 3);


    }
    public static void rearange(Bookshelf b) {
        // Books
        // Dictionary
        // books -> dictionary
        Bookshelf b2 = new Bookshelf();
        for (int i = 0; i < b.size(); i++) {
            Books book = b.remove(i);
            b.addBook(i, book);
            if (book instanceof Dictionary)
                b2.addBookOnRightSide(book);
            else
                b2.addBookOnLeftSide(book);
        }

        System.out.println(b2);

    }

    private static void getData(int ...numbers) {
        System.out.println(888);
    }

}
