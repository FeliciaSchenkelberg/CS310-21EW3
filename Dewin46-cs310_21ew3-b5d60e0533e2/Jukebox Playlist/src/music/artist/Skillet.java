package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//created Skillet Class and added Songs 1-3 -Tammie_Pease

public class Skillet {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Skillet() {
    }
    
    public ArrayList<Song> getSkilletsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Victorious", "Skillet");             //Create a song
         Song track2 = new Song("Not Gunna Die", "Skillet");         //Create another song
         Song track3 = new Song("Whispers in the Dark", "Skillet");         //Create another song
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          //Add songs for Skillet here
         this.albumTracks.add(track3); 
         return albumTracks;                                                    //Return the songs for the Skilet in the form of an ArrayList
    }
}
