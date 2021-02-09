package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class SystemOfADown {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public SystemOfADown() {
    }
    
    public ArrayList<Song> getSystemSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Toxicity", "System Of A Down");                //Create a song
         Song track2 = new Song("Aerials", "System Of A Down");                 //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the System Of A Down
         this.albumTracks.add(track2);                                          //Add the second song to song list for the System Of A Down 
         return albumTracks;                                                    //Return the songs for the System Of A Down in the form of an ArrayList
    }
}
