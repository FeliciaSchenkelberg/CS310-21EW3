package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class KatyPerry {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public KatyPerry() {
    }
    
    public ArrayList<Song> getKatyPerrySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Hot N Cold", "Katy Perry");             //Create a song
         Song track2 = new Song("Dark Horse", "Katy Perry");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Katy Perry
         this.albumTracks.add(track2);                                          //Add the second song to song list for Katy Perry
         return albumTracks;                                                    //Return the songs for the Katy Perry in the form of an ArrayList
    }
}
