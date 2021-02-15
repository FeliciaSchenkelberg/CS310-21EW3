package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Tool {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Tool() {
    }
    
    public ArrayList<Song> getToolSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Sober", "Tool");             //Create a song
         Song track2 = new Song("Schism", "Tool");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list
         this.albumTracks.add(track2);                                          //Add the second song to song list 
         return albumTracks;                                                    //Return the songs  in the form of an ArrayList
    }
}
