package tamirlan.Books_and_dictionaries;

public class Books {

    private final String isbn;
    private String title = "";
    private int pages = 0;

    public Books(String isbn, String title, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title + ", ISBN: " + isbn + ", pages: " + pages;
    }
}
