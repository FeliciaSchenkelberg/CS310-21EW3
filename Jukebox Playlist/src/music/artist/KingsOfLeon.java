package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class KingsOfLeon {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public KingsOfLeon() {
    }
    
    public ArrayList<Song> KingsOfLeonSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Wait For Me", "Kings Of Leon");             	//Create a song
         Song track2 = new Song("Comeback Story", "Kings Of Leon");         	//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Kings Of Leon
         this.albumTracks.add(track2);                                          //Add the second song to song list for Kings Of Leon 
         return albumTracks;                                                    //Return the songs for Kings Of Leon in the form of an ArrayList
    }
}
