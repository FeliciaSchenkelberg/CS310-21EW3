package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;


// added artist Disturbed + songs
// Author(s): Katie Stapleton
public class Disturbed {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Disturbed() {
    }
    
    public ArrayList<Song> getDisturbedSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Indestructible", "Disturbed");               //Create a song
         Song track2 = new Song("Hold on to Memories", "Disturbed");           //Create another song
         Song track3 = new Song("Ten Thousand Fists", "Disturbed");           //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Disturbed
         this.albumTracks.add(track2);                                          //Add the second song to song list for Disturbed 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Disturbed 
         return albumTracks;                                                    //Return the songs for Disturbed in the form of an ArrayList
    }
}
