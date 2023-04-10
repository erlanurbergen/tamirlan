package tamirlan.music_collection;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Record> records = new ArrayList<>();
    private Genre genre;

    public Artist() {
    }

    public Artist(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public void addRecord(String name) {
        records.add(new Record(name));
    }

    public void addRecord(String name, Genre genre) {
        records.add(new Record(name, genre));
    }

    public void showCatalogue() {
        records.forEach(System.out::println);
    }

    public void showGenre(Genre genre) {
        System.out.println(genre);
    }
}
