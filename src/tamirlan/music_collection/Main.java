package tamirlan.music_collection;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("Artist", Genre.POP);
        artist.addRecord("hello song");
        artist.addRecord("hello song", Genre.POP);
        artist.showCatalogue();
    }
}
