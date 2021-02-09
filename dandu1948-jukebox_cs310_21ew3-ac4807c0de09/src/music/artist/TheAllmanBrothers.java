package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheAllmanBrothers {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheAllmanBrothers() {
    }
    
    public ArrayList<Song> getAllmanBrothersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                       //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Blue ", "The Allman Brothers");                    //Create a song
         Song track2 = new Song("Melissa", "The Allman Brothers");                  //Create another song
         Song track3 = new Song("Back Where It All Begins", "The Allman Brothers"); //Create another song
         this.albumTracks.add(track1);                                              //Add the first song to song list for the Allman Brothers
         this.albumTracks.add(track2);                                              //Add the second song to song list for the Allman Brothers 
         this.albumTracks.add(track3);                                              //Add the thirs song to song list for the Allman Brothers 
         return albumTracks;                                                        //Return the songs for the Allman Brothers in the form of an ArrayList
    }
}
