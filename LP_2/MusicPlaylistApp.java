import java.util.ArrayList;
import java.util.List;

class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " seconds)";
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        System.out.println("Songs:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }
}

public class MusicPlaylistApp {
    public static void main(String[] args) {
        Song song1 = new Song("Oniket_Prantor", "Artcell", 960);
        Song song2 = new Song("Abar_Hasimukh", "Sironamhin", 360);
        Song song3 = new Song("Epitaph", "Probar_Ripon", 380);
        Playlist playlist = new Playlist("Sarbajit Favourite->");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.displayPlaylist();
    }
}
