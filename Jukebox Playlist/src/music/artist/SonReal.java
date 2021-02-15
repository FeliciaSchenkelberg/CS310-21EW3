package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class SonReal {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public SonReal() {
    }
    
    public ArrayList<Song> getSonrealSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Everywhere We Go", "Sonreal");             //Create a song
         Song track2 = new Song("No Warm Up", "Sonreal");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list
         this.albumTracks.add(track2);                                          //Add the second song to song list 
         return albumTracks;                                                    //Return the songs in the form of an ArrayList
    }
}
