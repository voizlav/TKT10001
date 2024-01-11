
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d s)", this.artist, this.name, this.durationInSeconds);
    }

    @Override
    public boolean equals(Object compare) {
        if (!(compare instanceof Song)) {
            return false;
        }
        Song s = (Song) compare;
        return this.artist.equals(s.artist) && this.name.equals(s.name)
                && this.durationInSeconds == s.durationInSeconds;
    }
}
