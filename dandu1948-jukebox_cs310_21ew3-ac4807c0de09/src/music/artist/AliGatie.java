package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class AliGatie {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public AliGatie() {
    }
    
    public ArrayList<Song> getAliGatieSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   		//Instantiate the album so we can populate it below
    	 Song track1 = new Song("It's You", "Ali Gatie");             					//Create a song
         Song track2 = new Song("What If I Told You That I Love You ", "Ali Gatie");    //Create another song
         this.albumTracks.add(track1);                                          		//Add the first song to song list for Ali Gatie
         this.albumTracks.add(track2);                                          		//Add the second song to song list for Ali Gatie 
         return albumTracks;                                                    		//Return the songs for Ali Gatie in the form of an ArrayList
    }
}
