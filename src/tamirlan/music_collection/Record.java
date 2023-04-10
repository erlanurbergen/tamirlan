package tamirlan.music_collection;

public class Record {
    private String name;
    private Genre genre;

    public Record() {
    }

    public Record(String name) {
        this.name = name;
    }

    public Record(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
