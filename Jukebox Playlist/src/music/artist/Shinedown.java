package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;


// added artist Shinedown + songs
// Author(s): Katie Stapleton
public class Shinedown {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Shinedown() {
    }
    
    public ArrayList<Song> getShinedownSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Sound of Madness", "Shinedown");               //Create a song
         Song track2 = new Song("Outcast", "Shinedown");           //Create another song
         Song track3 = new Song("Black Soul", "Shinedown");           //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Shinedown
         this.albumTracks.add(track2);                                          //Add the second song to song list for Shinedown 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Shinedown 
         return albumTracks;                                                    //Return the songs for Shinedown in the form of an ArrayList
    }
}
