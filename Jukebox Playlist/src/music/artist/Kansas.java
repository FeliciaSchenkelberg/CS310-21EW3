package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Kansas {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Kansas() {
    }
    
    public ArrayList<Song> getKansasSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Carry on Wayward Son", "Kansas");             //Create a song
         Song track2 = new Song("Hold On", "Kansas");  
         Song track3 = new Song("Dust in the Wind", "Kansas");  			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Kansas
         this.albumTracks.add(track2);    
         this.albumTracks.add(track3);  									//Add the second song to song list for Kansas 
         return albumTracks;                                                    //Return the songs for Kansas in the form of an ArrayList
    }
}
