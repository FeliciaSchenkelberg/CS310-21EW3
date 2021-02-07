package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Maroon5 {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Maroon5() {
    }
    
    public ArrayList<Song> getMaroon5Songs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Girls Like You", "Maroon 5");             		//Create a song
         Song track2 = new Song("Moves Like Jagger", "Maroon 5");         		//Create another song
         Song track3 = new Song("Payphone", "Maroon 5");						//Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Maroon 5
         this.albumTracks.add(track2);                                          //Add the second song to song list for Maroon 5 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Maroon 5
         return albumTracks;                                                    //Return the songs for Maroon 5 in the form of an ArrayList
    }
}
