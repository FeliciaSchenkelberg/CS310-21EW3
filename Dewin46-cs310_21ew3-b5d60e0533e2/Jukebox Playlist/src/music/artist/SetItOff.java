package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//created SetItOff Class and Added songs 1-4 -Tammie_Pease

public class SetItOff {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public SetItOff() {
    }
    
    public ArrayList<Song> getSetItOffsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dancing with the Devil", "Set It Off");             //Create a song
         Song track2 = new Song("Wolf in Sheep's Clothing", "Set It Off");         //Create another song
         Song track3 = new Song("Why Worry", "Set It Off");         //Create another song
         Song track4 = new Song("Kill the Lights", "Set It Off");         //Create another song
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          //Add songs for Skillet here
         this.albumTracks.add(track3); 
         this.albumTracks.add(track4); 
         return albumTracks;                                                    //Return the songs for the Skilet in the form of an ArrayList
    }
}
