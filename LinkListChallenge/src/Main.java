import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Storm breaker","deep purple");
        album.addSong("one",1.00);
        album.addSong("two",2.00);
        albums.add(album);

        album = new Album("For those about tot rock","AC/DC");
        album.addSong("For those",5.44);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("you can't do it right",playList);
        albums.get(0).addToPlayList("holy man",playList);
        

    }
}