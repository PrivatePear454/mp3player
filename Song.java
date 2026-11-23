import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.scene.media.media;
import javafx.scene.media.Mediaplayer;

public class Song {
    private String name = null;
    private String album = null;
    private String artist = null;
    private String genre = null;
    private final String filename;
    public Song(File fname, String name) {
        PrintWriter writer = new PrintWriter(name + ".song");
        writer.println("Songfile used in Java mp3 player.");
        writer.println(name + "=title");
        writer.println(artist + "=artist");
        writer.println(album + "=album");
        writer.println(genre + "=genre");
        filename = name + ".song";
    }

    public void addSong(File filename) {

    }
    public void editSong(char var, String data) {
        String artist = null;
        String genre = null;
        String album = null;
        String name = null;
        if (var == 't') {
            artist = data;
           
        }
        if (var == 'g') {
            genre = data;
          
        }
        if (var == 'l') {
            album = data;
           
        }
        if (var == 'n') {
            name = data;
           
        }

    }
}
